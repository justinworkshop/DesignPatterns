package com.example.proxy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: RealSubject
 * Author: wei.zheng
 * Date: 2019/12/31 9:17
 * Description: 具体主题类
 */
public class RealSubject implements ISubject {
    @Override
    public void visit() {
        System.out.println("Visit RealSubject");
    }
}
