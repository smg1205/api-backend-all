package com.smg.module.request;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 用于接收注册的信息
 * uid 由数据库自动生成
 * uname 用户名称
 * upassword 用户密码
 *
 */
@Data
@Service
@Scope("prototype")
public class RequestRegister {
    private Integer uid;                // 用户ID
    private String uname;               // 用户名
    private String upassword;           // 用户密码
    private String checkPassword;       // 确认密码
}
