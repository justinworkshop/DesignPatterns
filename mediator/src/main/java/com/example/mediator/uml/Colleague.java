package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: Colleague
 * Author: wei.zheng
 * Date: 2019/10/25 22:18
 * Description: 抽象同事
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void action();
}
