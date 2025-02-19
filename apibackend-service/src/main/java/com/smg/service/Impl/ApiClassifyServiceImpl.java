package com.smg.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smg.common.BaseResponse;
import com.smg.common.ResultUtils;
import com.smg.module.entity.ApiClassify;
import com.smg.service.ApiClassifyService;
import com.smg.mapper.ApiClassifyMapper;
import com.smg.module.response.ResponseClassifyList;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 34861
* @description 针对表【api_classify】的数据库操作Service实现
* @createDate 2025-02-12 19:08:04
*/
@Service
public class ApiClassifyServiceImpl extends ServiceImpl<ApiClassifyMapper, ApiClassify>
    implements ApiClassifyService{
    @Resource
    BeanFactory beanFactory;

    /**
     * 查询所有的API种类信息
     * @return BaseResponse<ResponseClassifyList>
     */
    @Override
    public BaseResponse<ResponseClassifyList> getClassify() {
        ResponseClassifyList responseClassifyList = beanFactory.getBean(ResponseClassifyList.class);
        try {
            List<ApiClassify> apiClassifyList = this.list();
            responseClassifyList.setApiClassifyList(apiClassifyList);
            responseClassifyList.setStatus(true);
        } catch (Exception e) {
            responseClassifyList.setStatus(false);
        }
        return ResultUtils.success(responseClassifyList);
    }
}




