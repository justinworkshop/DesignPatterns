package com.example.decorator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractDecorator
 * Author: wei.zheng
 * Date: 2020/1/6 9:21
 * Description: 抽象装饰者类
 */
public abstract class AbstractDecorator extends AbstractComponent {
    private AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
