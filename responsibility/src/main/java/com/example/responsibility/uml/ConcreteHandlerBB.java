package com.example.responsibility.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteHandlerBB
 * Author: wei.zheng
 * Date: 2019/12/11 21:15
 * Description: 具体解决者AA
 */
public class ConcreteHandlerBB extends AbstractHandler {

    private boolean canHandle(String condition) {
        if (condition.equals("ConcreteHandlerBB")) {
            return true;
        }

        return false;
    }

    @Override
    public void handleRequest(String condition) {
        if (canHandle(condition)) {
            System.out.println("ConcreteHandlerBB handle this condition");
        } else {
            nextHandler.handleRequest(condition);
        }
    }
}
