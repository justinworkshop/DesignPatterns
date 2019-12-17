package com.example.iterator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/11 21:16
 * Description: 责任链模式用户类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandlerAA concreteHandlerAA = new ConcreteHandlerAA();

        ConcreteHandlerBB concreteHandlerBB = new ConcreteHandlerBB();

        concreteHandlerAA.setNextHandler(concreteHandlerBB);

        concreteHandlerBB.setNextHandler(concreteHandlerAA);

        concreteHandlerAA.handleRequest("ConcreteHandlerBB");
    }
}
