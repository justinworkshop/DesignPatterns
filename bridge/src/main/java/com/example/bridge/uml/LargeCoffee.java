package com.example.bridge.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: LargeCoffee
 * Author: wei.zheng
 * Date: 2020/1/14 8:22
 * Description: 大杯咖啡
 */
public class LargeCoffee extends AbstractCoffee {
    public LargeCoffee(AbstractAdditive impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Large " + impl.addAdditive() + " coffee");
    }
}
