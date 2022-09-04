package com.rich.trade.constant;

public enum SlotStatusEnum {

    INIT(0,"等待入仓"),
    KEEP(1,"持有"),
    OUT_READY(2,"准备出仓");

    private String desc;

    private int status;

    SlotStatusEnum(int status, String desc){
        status = status;
        desc = desc;
    }
}
