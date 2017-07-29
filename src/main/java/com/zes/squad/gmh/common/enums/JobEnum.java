package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum JobEnum {

    NAIL_TECHNICIAN(1, "美甲师"),
    BEAUTY_STYLIST(2, "美睫师"),
    BEAUTICIAN(3, "美容师"),
    MANAGER(4, "经理"),
    COUNSELOR(5, "咨询师");

    private int    key;
    private String desc;

}
