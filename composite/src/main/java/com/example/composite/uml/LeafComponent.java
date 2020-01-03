package com.example.composite.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: LeafComponent
 * Author: wei.zheng
 * Date: 2019/11/7 21:26
 * Description: 具体叶子节点
 */
public class LeafComponent extends AbstractComponent {
    public LeafComponent(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Leaf :" + name);
    }

    @Override
    public void addChild(AbstractComponent child) {
        throw new UnsupportedOperationException("Leaf can not add child.");
    }

    @Override
    public AbstractComponent getChild(int index) {
        throw new UnsupportedOperationException("Leaf have not child.");
    }

    @Override
    public void removeChild(AbstractComponent child) {
        throw new UnsupportedOperationException("Leaf can not remove child.");
    }
}
