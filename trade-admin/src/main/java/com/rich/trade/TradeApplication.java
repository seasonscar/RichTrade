package com.rich.trade;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class TradeApplication {
    private static Logger log=Logger.getLogger(TradeApplication.class.getName());
    public static void main(String[] args) {
        log.info("welcome to auto trade admin system");
    }
}
