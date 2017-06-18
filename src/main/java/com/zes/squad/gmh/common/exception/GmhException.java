package com.zes.squad.gmh.common.exception;

import lombok.Getter;

@Getter
public class GmhException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private int               code;
    private String            error;

    public GmhException(ErrorCodeEnum errorCodeEnum) {
        this(errorCodeEnum.getCode(), errorCodeEnum.getError());
    }

    public GmhException(ErrorCodeEnum errorCodeEnum, String error) {
        this(errorCodeEnum.getCode(), error);
    }

    public GmhException(int code, String error) {
        super();
        this.code = code;
        this.error = error;
    }

}
