package com.example.designpatterns.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SubwabStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 19:58
 * Description: 地铁策略
 */
public class SubwabStrategy implements Strategy {
    @Override
    public int calculatePrice(int distance) {
        return 1 * distance;
    }
}
