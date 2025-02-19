package com.smg.commen;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;
    @JsonCreator
    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
    public BaseResponse(int code, T data){this(code,  data, "");};
    public BaseResponse(ErrorCode ec){this(ec.getCode(), null, ec.getMessage());}
//    public BaseResponse(){this(0,  null);};
}
