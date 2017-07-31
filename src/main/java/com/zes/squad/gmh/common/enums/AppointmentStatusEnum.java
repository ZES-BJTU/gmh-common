package com.zes.squad.gmh.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum AppointmentStatusEnum {

    TO_DO(1, "待完成"),
    DONE(2, "已完成"),
    CANCEL(3, "已取消");

    private int    key;
    private String desc;

}