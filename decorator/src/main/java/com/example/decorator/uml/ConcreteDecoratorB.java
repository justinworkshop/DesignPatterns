package com.example.decorator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteDecoratorB
 * Author: wei.zheng
 * Date: 2020/1/6 9:24
 * Description: 装饰者具体实现类B
 */
public class ConcreteDecoratorB extends AbstractDecorator {
    public ConcreteDecoratorB(AbstractComponent component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        operateB();
    }

    private void operateB() {
        System.out.println("DecoratorB operator.");
    }
}
