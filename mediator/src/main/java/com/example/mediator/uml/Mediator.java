package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: Mediator
 * Author: wei.zheng
 * Date: 2019/10/25 22:17
 * Description: 抽象中介者
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
