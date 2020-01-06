package com.example.decorator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteDecoratorA
 * Author: wei.zheng
 * Date: 2020/1/6 9:23
 * Description: 装饰者具体实现类A
 */
public class ConcreteDecoratorA extends AbstractDecorator {
    public ConcreteDecoratorA(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        operateA();
    }

    private void operateA() {
        System.out.println("DecoratorA operator.");
    }
}
