package com.example.mediator.uml;

/**
 * Copyright (C), 2015-2019
 * FileName: ConcreteColleagueB
 * Author: wei.zheng
 * Date: 2019/10/25 22:21
 * Description: 具体同事B
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueB 将信息交给中介者处理");
    }
}
