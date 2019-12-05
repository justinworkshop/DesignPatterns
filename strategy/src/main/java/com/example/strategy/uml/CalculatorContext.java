package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CalculatorContext
 * Author: wei.zheng
 * Date: 2019/12/5 20:28
 * Description: 策略Context类
 */
public class CalculatorContext {
    private IStrategy mStrategy;

    public void setStrategy(IStrategy strategy) {
        this.mStrategy = strategy;
    }

    public int calculatePrice(int distance) {
        return mStrategy.calculatePrice(distance);
    }
}
