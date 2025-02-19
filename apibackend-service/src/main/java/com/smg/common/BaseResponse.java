package com.smg.common;

import lombok.Data;
/**
 * 返回通用类
 * @param <T>
 * @author hf47
 */
import java.io.Serializable;
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;
    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
    public BaseResponse(int code, T data){this(code,  data, "");};
    public BaseResponse(ErrorCode ec){this(ec.getCode(), null, ec.getMessage());}
}
