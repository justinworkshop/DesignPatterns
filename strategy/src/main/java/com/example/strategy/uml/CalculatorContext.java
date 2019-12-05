package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CalculatorContext
 * Author: wei.zheng
 * Date: 2019/12/5 20:00
 * Description: 策略Context角色类
 */
public class CalculatorContext {
    private Strategy mStrategy;

    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public int calculatePrice(int distance) {
        return mStrategy.calculatePrice(distance);
    }
}
