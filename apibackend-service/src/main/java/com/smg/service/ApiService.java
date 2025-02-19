package com.smg.service;

import com.smg.common.BaseResponse;
import com.smg.module.entity.Api;
import com.baomidou.mybatisplus.extension.service.IService;
import com.smg.module.response.ResponseAPIInfoList;
import com.smg.module.request.RequestAPI;
import com.smg.module.request.RequestDropAPI;
import com.smg.module.response.ResponseNormal;
import org.springframework.web.bind.annotation.RequestBody;

/**
* @author 34861
* @description 针对表【api】的数据库操作Service
* @createDate 2025-02-12 19:09:21
*/
public interface ApiService extends IService<Api> {
    BaseResponse<ResponseAPIInfoList> getApiInfo();

    BaseResponse<ResponseNormal> addAPI(RequestAPI requestAPI);
    BaseResponse<ResponseNormal> changeAPIInfo(@RequestBody RequestAPI requestAPI);

    BaseResponse<ResponseNormal> dropAPIService(RequestDropAPI requestDropAPI);

    BaseResponse<ResponseNormal> deleteAPI(RequestDropAPI requestDropAPI);
}
