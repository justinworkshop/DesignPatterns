package com.example.composite.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Component
 * Author: wei.zheng
 * Date: 2019/11/7 20:42
 * Description: 抽象节点
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();
}
