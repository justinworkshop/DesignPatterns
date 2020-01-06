package com.example.decorator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2020/1/6 9:25
 * Description: 装饰者模式用户类
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();

        AbstractDecorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();

        AbstractDecorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
