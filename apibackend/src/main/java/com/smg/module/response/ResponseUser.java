package com.smg.module.response;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Data
@Service
@Scope("prototype")
public class ResponseUser {
    private String uname;
    private String usk;
    private String uak;
    private String ctime;
    private String isability;
}
