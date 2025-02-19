package com.smg.module.request;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Data
@Service
public class RequestAPI {
    private Integer apid;
    private String apiname;
    private String apiurl;
    private String method;
    private String apinfo;
    private String parameter;
    private BigDecimal price;
    private String requestheader;
    private String responseheader;
    private String createtime;
    private String deletetime;
    private String classify;
    private Integer isability;
    private Integer times;
    private Integer success;
    private String token;
}
