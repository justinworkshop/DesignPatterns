package com.example.responsibility.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractHandler
 * Author: wei.zheng
 * Date: 2019/12/11 20:40
 * Description: 抽象处理者
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public abstract void handleRequest(String condition);

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
