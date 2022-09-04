package com.rich.trade.core;

import com.rich.trade.constant.ExchangeEnum;

import java.util.Arrays;
import java.util.logging.Logger;

public class TradeMain {
    private static Logger log=Logger.getLogger(TradeMain.class.getName());

    public static void main(String[] args) {
        long exchangeNum=Arrays.stream(ExchangeEnum.values()).count();
        log.info("welcome to auto trade system");
        log.info(String.valueOf(exchangeNum));
    }
}
