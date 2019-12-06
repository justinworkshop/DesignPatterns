package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: BusStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 20:25
 * Description: 公共汽车策略
 */
public class BusStrategy implements IStrategy {

    /* 1块钱起步， 每5公里加1块 */
    @Override
    public int calculatePrice(int distance) {
        if (distance <= 0) {
            return 0;
        }

        return 1 + distance / 5;
    }
}
