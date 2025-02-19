package com.smg.module.request;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Data
@Service
@Scope("prototype")
public class RequestDropAPI {
    private String token;
    private Integer apid;
}
