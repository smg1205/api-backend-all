package com.smg.remote;

import com.smg.module.request.RequestAPI;
import com.smg.module.request.RequestDropAPI;
import com.smg.module.response.ResponseAPIInfoList;
import com.smg.module.response.ResponseClassifyList;
import com.smg.module.response.ResponseNormal;
import com.smg.commen.BaseResponse;
import com.smg.remote.Impl.Remote;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/remote/api")
public class APIInfoRemoteService {
    @Resource
    Remote remote;
    @GetMapping("/api_info")
    public BaseResponse<ResponseAPIInfoList> getApiInfoList(){
        return remote.getApiInfoList();
    }
    @GetMapping("/apiClassify")
    public BaseResponse<ResponseClassifyList> getApiClassifyList(){
        return remote.getApiClassifyList();
    }
    @PostMapping("/changeAPIInfo")
    public BaseResponse<ResponseNormal> changeAPIInfo(@RequestBody RequestAPI requestAPI){
        return remote.changeAPIInfo(requestAPI);
    }
    @PostMapping("/addAPI")
    public BaseResponse<ResponseNormal> addAPI(@RequestBody RequestAPI requestAPI){
        return remote.addAPI(requestAPI);
    }

    @PostMapping("/dropAPI")
    public BaseResponse<ResponseNormal> dropAPI(@RequestBody RequestDropAPI requestDropAPI){
        return remote.dropAPI(requestDropAPI);
    }
    @PostMapping("/deleteAPI")
    public BaseResponse<ResponseNormal> deleteAPI(@RequestBody RequestDropAPI requestDropAPI){
        System.out.println("1111");
        return remote.deleteAPI(requestDropAPI);
    }

}
