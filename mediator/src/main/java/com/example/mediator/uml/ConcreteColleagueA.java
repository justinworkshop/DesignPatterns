package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: ConcreteColleagueA
 * Author: wei.zheng
 * Date: 2019/10/25 22:19
 * Description: 具体同事A
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA 将信息交给中介者处理");
    }
}
