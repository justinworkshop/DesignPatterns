package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CarStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 20:26
 * Description: 小汽车策略类
 */
public class CarStrategy implements IStrategy {

    /* 10块钱起步，每公里加1块 */
    @Override
    public int calculatePrice(int distance) {
        return 10 + 1 * distance;
    }
}
