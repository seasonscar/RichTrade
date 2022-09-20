package com.rich.trade.java.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger num=new AtomicInteger(1);
        num.compareAndSet(1,3);
        System.out.println(num);
        num.compareAndSet(2,3);
        System.out.println(num);
    }
}
