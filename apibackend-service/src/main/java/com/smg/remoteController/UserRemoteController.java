package com.smg.remoteController;

import com.smg.common.BaseResponse;
import com.smg.common.ResultUtils;
import com.smg.module.request.RequestRegister;
import com.smg.module.response.ResponseLogin;
import com.smg.service.UserService;
import com.smg.module.request.RequestLogin;
import com.smg.module.response.ResponseRegister;
import com.smg.module.request.RequestUser;
import com.smg.module.response.ResponseUser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserRemoteController {
    @Resource
    UserService userService;
    @PostMapping("/login")
    public BaseResponse<ResponseLogin> login(@RequestBody RequestLogin requestLogin){
        return userService.login(
                requestLogin.getUsername(),
                requestLogin.getPassword()
        );
    }
    @PostMapping("/register")
    public BaseResponse<ResponseRegister> register(@RequestBody RequestRegister requestRegister) {
        return userService.register(
                requestRegister.getUname(),
                requestRegister.getUpassword(),
                requestRegister.getCheckPassword()
        );
    }
    @PostMapping("/info")
    public BaseResponse<ResponseUser> info(@RequestBody RequestUser requestUser){
        return userService.getInfo(
                requestUser.getUsername(),
                requestUser.getToken()
        );
    }

}
