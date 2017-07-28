package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SexEnum {

    MALE(0, "女"),
    FEMALE(1, "男");

    private int    key;
    private String desc;

}
