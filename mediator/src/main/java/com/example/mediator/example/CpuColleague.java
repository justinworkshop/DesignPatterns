package com.example.mediator.example;

/**
 * Copyright (C), 2015-2019
 * FileName: CpuColleague
 * Author: wei.zheng
 * Date: 2019/10/25 22:31
 * Description: Cpu同事
 */
public class CpuColleague extends Colleague {

    public CpuColleague(Mediator mediator) {
        super(mediator);
    }

    public void check() {
        System.out.println("开始检测资源");
        mediator.changed(this);
    }
}
