package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: BusStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 19:55
 * Description: 公交车策略
 */
public class BusStrategy implements Strategy {
    @Override
    public int calculatePrice(int distance) {
        return 1 + 1 * distance / 2;
    }
}
