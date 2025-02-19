package com.smg.configuration;

import org.springframework.stereotype.Component;

@Component
public class UserRemoteServiceFallBackFactory {
//    @Override
//    public Remote create(Throwable cause) {
//        return new Remote() {
//            @Override
//            public BaseResponse<ResponseLogin> login(RequestLogin requestLogin) {
//                ResponseLogin responseLogin = beanFactory.getBean(ResponseLogin.class);
//                responseLogin.setLoginStatus(false);
//                responseLogin.setMessage("当前服务已停用，请稍后使用");
//                responseLogin.setToken(null);
//                responseLogin.setAdminStatus(false);
//                return ResultUtils.success(responseLogin);
//            }
//
//            @Override
//            public BaseResponse<ResponseRegister> register(RequestRegister requestRegister) {
//                ResponseRegister responseRegister = beanFactory.getBean(ResponseRegister.class);
//                responseRegister.setRegisterStatus(false);
//                responseRegister.setMessage("当前服务已停用，请稍后使用");
//                responseRegister.setToken(null);
//                responseRegister.setSk(null);
//                responseRegister.setAk(null);
//                return ResultUtils.success(responseRegister);
//            }
//
//            @Override
//            public BaseResponse<ResponseUser> getInfo(RequestUser requestUser) {
//                ResponseUser responseUser  = beanFactory.getBean(ResponseUser.class);
//                responseUser.setUname(null);
//                responseUser.setIsability("当前服务已停用，请稍后使用");
//                responseUser.setUak(null);
//                responseUser.setUsk(null);
//                responseUser.setCtime(null);
//                return ResultUtils.success(responseUser);
//            }
//
//            @Override
//            public BaseResponse<ResponseAPIInfoList> getApiInfoList() {
//                return null;
//            }
//
//            @Override
//            public BaseResponse<ResponseNormal> changeAPIInfo() {
//                return null;
//            }
//
//            @Override
//            public BaseResponse<ResponseNormal> addAPI(RequestAPI requestAPI) {
//                return null;
//            }
//
//            @Override
//            public BaseResponse<ResponseNormal> dropAPI(RequestDropAPI requestDropAPI) {
//                return null;
//            }
//
//            @Override
//            public BaseResponse<ResponseNormal> deleteAPI(RequestDropAPI requestDropAPI) {
//                return null;
//            }
//        };
//    }
}
