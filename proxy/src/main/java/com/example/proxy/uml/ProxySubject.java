package com.example.proxy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ProxySubject
 * Author: wei.zheng
 * Date: 2019/12/31 9:17
 * Description: 代理主题类 - 静态代理
 */
public class ProxySubject implements ISubject {
    private ISubject subject;

    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
