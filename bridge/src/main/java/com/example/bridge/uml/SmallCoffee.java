package com.example.bridge.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SmallCoffee
 * Author: wei.zheng
 * Date: 2020/1/14 8:23
 * Description: 小杯咖啡
 */
public class SmallCoffee extends AbstractCoffee {
    public SmallCoffee(AbstractAdditive impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Small " + impl.addAdditive() + " coffee");
    }
}
