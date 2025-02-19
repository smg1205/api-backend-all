package com.smg.module.response;

import lombok.Data;
import com.smg.module.entity.Api;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@Scope("prototype")
public class ResponseAPIInfoList {
    private Boolean status;
    private List<Api> responseAPIInfoList;
}
