package com.smg.service;

import com.smg.common.BaseResponse;
import com.smg.module.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.smg.module.request.RequestUser;
import com.smg.module.response.ResponseLogin;
import com.smg.module.response.ResponseRegister;
import com.smg.module.response.ResponseUser;
import org.springframework.web.bind.annotation.RequestBody;

/**
* @author 34861
* @description 针对表【users】的数据库操作Service
* @createDate 2025-01-14 10:48:36
*/
public interface UserService extends IService<User> {
    BaseResponse<ResponseUser> getInfo(String username, String token);
    BaseResponse<ResponseLogin> login(String username, String password);
    BaseResponse<ResponseRegister> register(String username, String password, String checkPassword);
}
