package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ProjectTypeEnum {

    NAIL(1, "美甲"),
    LIDS(2, "美睫"),
    BEAUTY(3, "美容"),
    PRODUCT(4, "产品");

    private int    key;
    private String desc;

}
