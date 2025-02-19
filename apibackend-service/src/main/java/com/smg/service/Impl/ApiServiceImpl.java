package com.smg.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smg.common.BaseResponse;
import com.smg.common.ResultUtils;
import com.smg.module.entity.Api;
import com.smg.service.ApiService;
import com.smg.module.response.ResponseAPIInfoList;
import com.smg.module.request.RequestAPI;
import com.smg.module.request.RequestDropAPI;
import com.smg.module.response.ResponseNormal;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;
import com.smg.mapper.ApiMapper;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
* @author 34861
* @description 针对表【api】的数据库操作Service实现
* @createDate 2025-02-12 19:09:21
*/
@Service
public class ApiServiceImpl extends ServiceImpl<ApiMapper, Api>
    implements ApiService{
    @Resource
    BeanFactory beanFactory;
    public BaseResponse<ResponseNormal> dropAPIService(RequestDropAPI requestDropAPI) {
        ResponseNormal responseNormal = beanFactory.getBean(ResponseNormal.class);
        responseNormal.setResponseStatus(false);
        Api apiEntity = this.getById(requestDropAPI.getApid());
        if (apiEntity != null) {
            if(apiEntity.getIsability() == 1){
                apiEntity.setIsability(0);
            }else{
                apiEntity.setIsability(1);
            }
            boolean result = this.updateById(apiEntity);
            if(result){
                responseNormal.setResponseStatus(true);
            }
        }
        return ResultUtils.success(responseNormal);
    }

    @Override
    public BaseResponse<ResponseNormal> deleteAPI(RequestDropAPI requestDropAPI) {
        ResponseNormal responseNormal = beanFactory.getBean(ResponseNormal.class);
        responseNormal.setResponseStatus(false);
        LambdaQueryWrapper<Api> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Api::getApid, requestDropAPI.getApid());
        Api deleteApi = this.getOne(lambdaQueryWrapper);
        if(deleteApi != null && deleteApi.getIsdelete() != 1){
            deleteApi.setIsdelete(1);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            deleteApi.setDeletetime(now.format(formatter));
            responseNormal.setResponseStatus(this.updateById(deleteApi));
        }

        return ResultUtils.success(responseNormal);
    }

    /**
     * 获取全部API的信息
     * @return BaseResponse<ResponseAPIInfoList>
     */
    @Override
    public BaseResponse<ResponseAPIInfoList> getApiInfo() {
        ResponseAPIInfoList responseAPIList = beanFactory.getBean(ResponseAPIInfoList.class);
        try {
            List<Api> apiList = this.list();
            responseAPIList.setResponseAPIInfoList(apiList);
            responseAPIList.setStatus(true);
        } catch (Exception e) {
            responseAPIList.setStatus(false);
        }

        return ResultUtils.success(responseAPIList);
    }

    /**
     * 添加API信息，如果已存在则不添加
     * @param requestAPI
     * @return BaseResponse<ResponseNormal>
     */
    @Override
    public BaseResponse<ResponseNormal> addAPI(RequestAPI requestAPI) {
        ResponseNormal responseNormal = beanFactory.getBean(ResponseNormal.class);
        LambdaQueryWrapper<Api> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Api::getApiname, requestAPI.getApiname());
        Api existingAPI = this.getOne(queryWrapper);
        responseNormal.setResponseStatus(false);
        if (existingAPI == null) {
            existingAPI = beanFactory.getBean(Api.class);
            existingAPI.setApiname(requestAPI.getApiname());
            existingAPI.setApiurl(requestAPI.getApiurl());
            existingAPI.setMethod(requestAPI.getMethod());
            existingAPI.setApinfo(requestAPI.getApinfo());
            existingAPI.setParameter(requestAPI.getParameter());
            existingAPI.setPrice(requestAPI.getPrice());
            existingAPI.setClassify(Integer.parseInt(requestAPI.getClassify()));
            existingAPI.setRequestheader(requestAPI.getRequestheader());
            existingAPI.setResponseheader(requestAPI.getResponseheader());
            existingAPI.setTimes(requestAPI.getTimes());
            existingAPI.setSuccess(requestAPI.getSuccess());
//            this.save(existingAPI);
            responseNormal.setResponseStatus(true);
        } else {
            return ResultUtils.success(responseNormal);
        }
        return ResultUtils.success(responseNormal);
    }

    @Override
    public BaseResponse<ResponseNormal> changeAPIInfo(RequestAPI requestAPI) {
        ResponseNormal responseNormal = beanFactory.getBean(ResponseNormal.class);
        LambdaQueryWrapper<Api> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Api::getApiname, requestAPI.getApiname());
        Api existingAPI = this.getOne(queryWrapper);
        responseNormal.setResponseStatus(false);
        if (existingAPI == null) {
            return ResultUtils.success(responseNormal);
        } else {
            if(requestAPI.getApiname().length() < 3){
                return ResultUtils.success(responseNormal);
            }
            existingAPI.setApiname(requestAPI.getApiname());
            existingAPI.setApiurl(requestAPI.getApiurl());
            existingAPI.setMethod(requestAPI.getMethod());
            existingAPI.setApinfo(requestAPI.getApinfo());
            existingAPI.setParameter(requestAPI.getParameter());
            existingAPI.setPrice(requestAPI.getPrice());
            existingAPI.setClassify(Integer.parseInt(requestAPI.getClassify()));
            existingAPI.setRequestheader(requestAPI.getRequestheader());
            existingAPI.setResponseheader(requestAPI.getResponseheader());
            existingAPI.setCreatetime(requestAPI.getCreatetime());
            existingAPI.setDeletetime(requestAPI.getDeletetime());
            existingAPI.setIsability(requestAPI.getIsability());
            existingAPI.setTimes(requestAPI.getTimes());
            existingAPI.setSuccess(requestAPI.getSuccess());
            existingAPI.setApid(existingAPI.getApid());
            existingAPI.setIsdelete(existingAPI.getIsdelete());
            this.updateById(existingAPI);
            responseNormal.setResponseStatus(true);
        }
        return ResultUtils.success(responseNormal);
    }


}




