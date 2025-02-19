package com.smg.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smg.common.BaseResponse;
import com.smg.common.ResultUtils;
import com.smg.module.entity.User;
import com.smg.mapper.UsersMapper;
import com.smg.module.request.RequestUser;
import com.smg.module.response.ResponseLogin;
import com.smg.module.response.ResponseRegister;
import com.smg.module.response.ResponseUser;
import com.smg.service.UserService;
import com.smg.utils.AK;
import com.smg.utils.SK;
import com.smg.utils.Token;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
* @author 34861
* @description 针对表【users】的数据库操作Service实现
* @createDate 2025-01-14 10:48:36
*/
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, User>
    implements UserService {
    @Resource
    BeanFactory beanFactory;
    @Resource
    AK ak;
    @Resource
    SK sk;
    public BaseResponse<ResponseUser> getInfo(String username, String token){
        ResponseUser responseUser = beanFactory.getBean(ResponseUser.class);

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUname, username);
        User userInfo = this.getOne(queryWrapper);
        responseUser.setUak("");
        responseUser.setIsability("");
        responseUser.setUsk("");
        responseUser.setCtime("");
        responseUser.setUname("");
        if(userInfo != null){
            responseUser.setUak(userInfo.getUak());
            responseUser.setIsability(userInfo.getIsability() == 1 ? "可用" : "不可用");
            responseUser.setUsk(userInfo.getUsk());
            responseUser.setCtime(userInfo.getCtime().toString());
            responseUser.setUname(userInfo.getUname());
        }
        return ResultUtils.success(responseUser);
    }

    public BaseResponse<ResponseLogin> login(String username, String password) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        ResponseLogin responseLogin = beanFactory.getBean(ResponseLogin.class);
        queryWrapper.eq(User::getUname, username);
        queryWrapper.eq(User::getUpassword, password);
        User user = this.getOne(queryWrapper);

        if (user != null) {
            responseLogin.setLoginStatus(true);
            responseLogin.setMessage("登陆成功，即将跳转");
            responseLogin.setToken(Token.generateToken(username));
            responseLogin.setAdminStatus(user.getIsadmin() == 1);
        } else {
            responseLogin.setLoginStatus(false);
            responseLogin.setMessage("登陆失败，密码或账户错误");
            responseLogin.setToken(Token.generateToken("null"));
            responseLogin.setAdminStatus(false);
        }
        return ResultUtils.success(responseLogin);
    }

    @Override
    public BaseResponse<ResponseRegister> register(String username, String password, String checkPassword) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUname, username);
        User existingUser = this.getOne(queryWrapper);
        ResponseRegister register = beanFactory.getBean(ResponseRegister.class);

        register.setRegisterStatus(false);
        register.setAk("null");
        register.setSk("null");
        register.setToken("null");
        register.setToken(Token.generateToken("null"));
        if(username == null || password == null || checkPassword == null){
            register.setMessage("存在空数值");
            return ResultUtils.success(register);
        }
        if (existingUser != null) {
            register.setMessage("注册失败，该用户已存在");
            return ResultUtils.success(register);
        } else if (password.length() < 10) {
            register.setMessage("注册失败，密码长度必须至少为10个字符");
            return ResultUtils.success(register);
        } else if (username.length() < 5) {
            register.setMessage("注册失败，用户名长度必须至少为5个字符");
            return ResultUtils.success(register);
        } else if (!password.equals(checkPassword)) {
            register.setMessage("注册失败，密码不匹配");
            return ResultUtils.success(register);
        } else {
            User newUser = this.beanFactory.getBean(User.class);
            newUser.setUname(username);
            newUser.setUpassword(password);
            newUser.setUak(this.ak.GetAK(username));
            newUser.setUsk(this.sk.GetSK(username));
            this.save(newUser);
            register.setRegisterStatus(true);
            register.setAk(newUser.getUak());
            register.setSk(newUser.getUsk());
            register.setToken(Token.generateToken(username));
            register.setMessage("注册成功，即将跳转");
            return ResultUtils.success(register);
        }
    }

}




