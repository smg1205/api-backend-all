package com.smg.module.request;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 用于接收user的属性
 * username 用户名称
 * password 用户密码
 */
@Data
@Service
@Scope("prototype")
public class RequestLogin {
    private String username;
    private String password;
}
