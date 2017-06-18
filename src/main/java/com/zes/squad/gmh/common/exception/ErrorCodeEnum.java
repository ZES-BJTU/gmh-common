package com.zes.squad.gmh.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorCodeEnum {

    BUSINESS_EXCEPTION(10000, "业务异常"),
    BUSINESS_EXCEPTION_INVALID_PARAMETERS(10001, "参数不合法"),
    BUSINESS_EXCEPTION_ENTITY_NOT_FOUND(10002, "未找到主体对象"),
    BUSINESS_EXCEPTION_ILLEGAL_STATUS(10003, "状态不合法"),
    BUSINESS_EXCEPTION_OPERATION_NOT_ALLOWED(10004, "操作不允许"),
    BUSINESS_EXCEPTION_COLLECTION_IS_EMPTY(10005, "数据集合为空"),
    BUSINESS_EXCEPTION_OPERATION_FAILED(10006, "操作失败"),
    BUSINESS_EXCEPTION_OPERATION_NOT_SUPPORTTED(10007, "操作不支持"),
    BUSINESS_EXCEPTION_CONDITION_NOT_SUPPORTTED(10008, "条件不支持"),

    PERSISTENCE_EXCEPTION(20000, "持久化异常"),

    RPC_EXCEPTION(30000, "rpc异常"),

    CACHE_EXCEPTION(40000, "缓存异常"),
    CACHE_EXCEPTION_EXPIRE_FAIL(40001, "设定缓存过期异常"),
    CACHE_EXCEPTION_SERIALIZE_FAIL(40002, "序列化对象异常"),
    CACHE_EXCEPTION_DESERIALIZE_FAIL(40003, "反序列化对象异常"),

    WEB_EXCEPTION(50000, "web异常"),
    WEB_EXCEPTION_AUTH_FAIL(50001, "web认证异常"),

    UNKNOWN_EXCEPTION(70000, "未知异常");

    private int    code;
    private String error;

}
