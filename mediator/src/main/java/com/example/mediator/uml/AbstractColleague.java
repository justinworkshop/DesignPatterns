package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: AbstractColleague
 * Author: wei.zheng
 * Date: 2019/10/25 22:18
 * Description: 抽象同事类，持有中介对象的引用，可以调用中介对象的方法，达到通知中介者的目的
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator;
    }

    public abstract void action();
}
