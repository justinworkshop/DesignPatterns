package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: ConcreteMediator
 * Author: wei.zheng
 * Date: 2019/10/25 22:22
 * Description: 具体中介者
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
