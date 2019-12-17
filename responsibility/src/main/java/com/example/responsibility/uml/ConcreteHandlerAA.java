package com.example.responsibility.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteHandlerAA
 * Author: wei.zheng
 * Date: 2019/12/11 21:02
 * Description: 具体解决者AA
 */
public class ConcreteHandlerAA extends AbstractHandler {

    private boolean canHandle(String condition) {
        if (condition.equals("ConcreteHandlerAA")) {
            return true;
        }

        return false;
    }

    @Override
    public void handleRequest(String condition) {
        if (canHandle(condition)) {
            System.out.println("ConcreteHandlerAA handle this condition");
        } else {
            nextHandler.handleRequest(condition);
        }
    }
}
