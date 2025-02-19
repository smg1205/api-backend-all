package com.smg.common;

import com.fasterxml.jackson.databind.ser.Serializers;

public class ResultUtils {
    /**
     * 成功
     * @param data
     * @return BaseResponse<T>
     * @param <T>
     */
    public static<T> BaseResponse<T> success(T data){return new BaseResponse<>(0, data, "ok");};

    /**
     * 失败
     * @param ec
     * @return BaseResponse
     */
    public static BaseResponse error(ErrorCode ec){return new BaseResponse<>(ec);}

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
