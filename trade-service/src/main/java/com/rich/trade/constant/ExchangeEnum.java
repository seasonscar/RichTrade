package com.rich.trade.constant;

public enum ExchangeEnum {

    SHANGHAI("上海证券交易所",600),
    SHENZHEN("深圳证券交易所",000),
    CHUANGYE("创业板   ",300);

    private String exchangeName;

    private int exchangeCode;

    ExchangeEnum(String exchangeName,int exchangeCode){
        exchangeName = exchangeName;
        exchangeCode = exchangeCode;
    }
}
