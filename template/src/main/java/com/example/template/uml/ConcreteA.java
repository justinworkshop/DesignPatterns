package com.example.template.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteA
 * Author: wei.zheng
 * Date: 2019/12/18 21:14
 * Description: ConcreteA 具体实现A, 可以覆盖各个流程方法
 */
public class ConcreteA extends AbstractTemplate {
    @Override
    protected void stepOne() {
        System.out.println("ConcreteA stepOne");
    }

    @Override
    protected void stepTwo() {
        System.out.println("ConcreteA stepTwo");
    }

    @Override
    protected void stepThree() {
        System.out.println("ConcreteA stepThree");
    }
}
