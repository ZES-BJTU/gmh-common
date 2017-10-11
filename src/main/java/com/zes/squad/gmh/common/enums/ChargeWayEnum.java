package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ChargeWayEnum {

    CARD(1, "会员卡"),
    CASH(2, "其它"),
    GIVE(3, "赠送");

    private int    key;
    private String desc;

}
