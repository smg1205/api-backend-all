package com.smg.service;

import com.smg.common.BaseResponse;
import com.smg.module.entity.ApiClassify;
import com.baomidou.mybatisplus.extension.service.IService;
import com.smg.module.response.ResponseClassifyList;

/**
* @author 34861
* @description 针对表【api_classify】的数据库操作Service
* @createDate 2025-02-12 19:08:04
*/
public interface ApiClassifyService extends IService<ApiClassify> {
    BaseResponse<ResponseClassifyList> getClassify();
}
