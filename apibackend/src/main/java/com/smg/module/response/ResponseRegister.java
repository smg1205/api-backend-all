package com.smg.module.response;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 用于返回注册的响应体
 * SK，AK 密钥和通行密钥
 * message 注册信息
 * RegisterStatus 是否注册成功
 */
@Data
@Service
@Scope("prototype")
public class ResponseRegister {
    public String sk;
    public String ak;
    public String token;
    public String message;
    public Boolean registerStatus;
}
