package com.example.designpatterns.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/5 20:02
 * Description: 用户类使用举例
 */
public class Client {

    public static void main(String[] args) {
        CalculatorContext mCalculatorContext = new CalculatorContext();
        // 轿车10km费用
        mCalculatorContext.setStrategy(new CarStrategy());
        mCalculatorContext.calculatePrice(10);

        // 公交车10km费用
        mCalculatorContext.setStrategy(new BusStrategy());
        mCalculatorContext.calculatePrice(10);
    }
}
