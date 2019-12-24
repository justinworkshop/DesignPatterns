package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: AbstractMediator
 * Author: wei.zheng
 * Date: 2019/10/25 22:17
 * Description: 抽象中介者, 持有具体同事的引用
 */
public abstract class AbstractMediator {
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
