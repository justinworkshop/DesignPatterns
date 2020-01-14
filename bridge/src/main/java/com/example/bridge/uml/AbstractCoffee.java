package com.example.bridge.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractCoffee
 * Author: wei.zheng
 * Date: 2020/1/14 8:18
 * Description: Coffee抽象类(维度一)，持有抽象Additive的引用
 */
public abstract class AbstractCoffee {
    protected AbstractAdditive impl;

    public AbstractCoffee(AbstractAdditive impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
