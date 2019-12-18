package com.example.template.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteB
 * Author: wei.zheng
 * Date: 2019/12/18 21:15
 * Description: ConcreteB 具体实现B
 */
public class ConcreteB extends AbstractTemplate {
    @Override
    protected void stepOne() {
        System.out.println("ConcreteB stepOne");
    }

    @Override
    protected void stepTwo() {
        System.out.println("ConcreteB stepTwo");
    }

    @Override
    protected void stepThree() {
        System.out.println("ConcreteB stepThree");
    }
}
