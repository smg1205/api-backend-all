package com.smg.remote.Impl;

import com.smg.module.response.*;
import com.smg.commen.BaseResponse;
import com.smg.module.request.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "gatewayCenter",url="http://localhost:8090")
public interface Remote {
    @PostMapping("/user/login")
    BaseResponse<ResponseLogin> login(@RequestBody RequestLogin requestLogin);
    @PostMapping("/user/register")
    BaseResponse<ResponseRegister> register(@RequestBody RequestRegister requestRegister);

    @PostMapping("/user/info")
    BaseResponse<ResponseUser> getInfo(@RequestBody RequestUser requestUser);

    @GetMapping("/api/api_info")
    BaseResponse<ResponseAPIInfoList> getApiInfoList();

    @GetMapping("/api/apiClassify")
    BaseResponse<ResponseClassifyList> getApiClassifyList();

    @PostMapping("/api/addAPI")
    BaseResponse<ResponseNormal> addAPI(@RequestBody RequestAPI requestAPI);
    @PostMapping("/api/dropAPI")
    BaseResponse<ResponseNormal> dropAPI(@RequestBody RequestDropAPI requestDropAPI);
    @PostMapping("/api/deleteAPI")
    BaseResponse<ResponseNormal> deleteAPI(@RequestBody RequestDropAPI requestDropAPI);
    @PostMapping("/api/changeAPIInfo")
    BaseResponse<ResponseNormal> changeAPIInfo(@RequestBody RequestAPI requestAPI);
}
