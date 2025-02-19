package com.smg.module.response;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 用于返回登录的返回体
 * message 注册信息
 * LoginStatus 是否登录成功
 */

@Data
@Service
@Scope("prototype")
public class ResponseLogin {
    private String token;
    private String message;
    private Boolean loginStatus;
    private Boolean adminStatus;
}
