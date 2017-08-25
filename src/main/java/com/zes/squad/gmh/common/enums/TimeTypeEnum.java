package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum TimeTypeEnum {

    FREE(1, "空闲"),
    BUSY(2, "占用");

    private int    key;
    private String desc;

}
