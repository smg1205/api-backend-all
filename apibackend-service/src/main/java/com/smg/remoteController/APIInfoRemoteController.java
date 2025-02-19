package com.smg.remoteController;

import com.smg.common.BaseResponse;
import com.smg.service.ApiClassifyService;
import com.smg.service.ApiService;
import com.smg.module.response.ResponseAPIInfoList;
import com.smg.module.response.ResponseClassifyList;
import com.smg.module.request.RequestAPI;
import com.smg.module.request.RequestDropAPI;
import com.smg.module.response.ResponseNormal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class APIInfoRemoteController {
    @Resource
    ApiService apiService;
    @Resource
    ApiClassifyService apiClassifyService;

    /**
     *  获取所有的API信息
     * @return BaseResponse<ResponseAPIInfoList>
     */
    @GetMapping("/api_info")
    public BaseResponse<ResponseAPIInfoList> getApiInfoList(){
        return apiService.getApiInfo();
    }

    /**
     * 获取所有的API种类信息
     * @return BaseResponse<ResponseClassifyList>
     */
    @GetMapping("/apiClassify")
    public BaseResponse<ResponseClassifyList> getApiClassifyList(){
        return apiClassifyService.getClassify();
    }

    /**
     * 添加一个API信息
     * @param requestAPI
     * @return BaseResponse<ResponseNormal>
     */
    @PostMapping("addAPI")
    public BaseResponse<ResponseNormal> addAPI(@RequestBody RequestAPI requestAPI){
        return apiService.addAPI(requestAPI);
    }
    @PostMapping("/changeAPIInfo")
    public BaseResponse<ResponseNormal> changeAPIInfo(@RequestBody RequestAPI requestAPI){
        return apiService.changeAPIInfo(requestAPI);
    }
    @PostMapping("/dropAPI")
    public BaseResponse<ResponseNormal> dropAPI(@RequestBody RequestDropAPI requestDropAPI){
        return apiService.dropAPIService(requestDropAPI);
    }
    @PostMapping("/deleteAPI")
    public BaseResponse<ResponseNormal> deleteAPI(@RequestBody RequestDropAPI requestDropAPI){
        return apiService.deleteAPI(requestDropAPI);
    }
}
