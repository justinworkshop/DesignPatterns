package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CarStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 19:56
 * Description: 轿车策略
 */
public class CarStrategy implements Strategy {
    @Override
    public int calculatePrice(int distance) {
        return 10 + 2 * distance;
    }
}
