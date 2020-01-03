package com.example.composite.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractComponent
 * Author: wei.zheng
 * Date: 2019/11/7 20:42
 * Description: 抽象节点: 接口设计
 */
public abstract class AbstractComponent {
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(AbstractComponent child);

    public abstract AbstractComponent getChild(int index);

    public abstract void removeChild(AbstractComponent child);
}
