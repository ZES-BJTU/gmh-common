package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum StaffLevelEnum {

    STAFF(1, "前台"),
    BEAUTICIAN(2, "前台"),
    ADMINISTRATOR(3, "管理员");

    private int    key;
    private String desc;

}
