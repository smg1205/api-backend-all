package com.smg.remote;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.smg.module.request.RequestLogin;
import com.smg.module.request.RequestRegister;
import com.smg.module.request.RequestUser;
import com.smg.module.response.ResponseLogin;
import com.smg.module.response.ResponseRegister;
import com.smg.module.response.ResponseUser;
import com.smg.commen.BaseResponse;
import com.smg.commen.ResultUtils;
import com.smg.remote.Impl.Remote;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/remote/user")
public class UserRemoteService {
    @Resource
    Remote remote;
    @Resource
    BeanFactory beanFactory;
    @PostMapping("/login")
    @HystrixCommand(fallbackMethod = "loginFailed")
    public BaseResponse<ResponseLogin> login(@RequestBody RequestLogin requestLogin){
        return remote.login(requestLogin);
    }
    @PostMapping("/register")
    @HystrixCommand(fallbackMethod = "registerFailed")
    public BaseResponse<ResponseRegister> register(@RequestBody RequestRegister requestRegister){
        return remote.register(requestRegister);
    }
    @PostMapping("/getInfo")
    @HystrixCommand(fallbackMethod = "getInfoFailed")
    public BaseResponse<ResponseUser> getInfo(@RequestBody RequestUser requestUser){
        return remote.getInfo(requestUser);
    }
    public BaseResponse<ResponseUser> getInfoFailed(@RequestBody RequestUser requestUser){
        ResponseUser responseUser  = beanFactory.getBean(ResponseUser.class);
        responseUser.setUname(null);
        responseUser.setIsability("未知");
        responseUser.setUak(null);
        responseUser.setUsk(null);
        responseUser.setCtime(null);
        return ResultUtils.success(responseUser);
    }
    public BaseResponse<ResponseRegister> registerFailed(@RequestBody RequestRegister requestRegister){
        ResponseRegister responseRegister = beanFactory.getBean(ResponseRegister.class);
        responseRegister.setRegisterStatus(false);
        responseRegister.setMessage("注册失败");
        responseRegister.setToken(null);
        responseRegister.setSk(null);
        responseRegister.setAk(null);
        return ResultUtils.success(responseRegister);
    }
    public BaseResponse<ResponseLogin> loginFailed(@RequestBody RequestLogin requestLogin){
        ResponseLogin responseLogin = beanFactory.getBean(ResponseLogin.class);
        responseLogin.setLoginStatus(false);
        responseLogin.setMessage("登录失败");
        responseLogin.setToken(null);
        responseLogin.setAdminStatus(false);
        return ResultUtils.success(responseLogin);
    }
}
