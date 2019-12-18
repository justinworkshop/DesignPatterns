package com.example.template.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractTemplate
 * Author: wei.zheng
 * Date: 2019/12/18 9:48
 * Description: 模板抽象类
 */
public abstract class AbstractTemplate {
    public final void execute() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected void stepOne() {
        System.out.println("stepOne");
    }

    protected void stepTwo() {
        System.out.println("stepTwo");
    }

    protected void stepThree() {
        System.out.println("stepThree");
    }
}
