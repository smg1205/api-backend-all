package com.smg.expection;

import com.smg.common.ErrorCode;

public class BusinessException extends Exception {
    private final int code;

    public BusinessException(int code, String message){
        super(message);
        this.code = code;
    }
    public BusinessException(String message, ErrorCode ec){
        super(ec.getMessage());
        this.code = ec.getCode();
    }
    public BusinessException(ErrorCode ec, String message){
        super(message);
        this.code = ec.getCode();
    }
}
