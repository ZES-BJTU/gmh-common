package com.zes.squad.gmh.common.exception;

public class GmhCacheException extends GmhException {

    private static final long serialVersionUID = 1L;

    public GmhCacheException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public GmhCacheException(ErrorCodeEnum errorCodeEnum, String error) {
        super(errorCodeEnum, error);
    }
}
