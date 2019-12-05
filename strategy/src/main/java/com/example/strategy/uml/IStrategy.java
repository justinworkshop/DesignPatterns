package com.example.strategy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: IStrategy
 * Author: wei.zheng
 * Date: 2019/12/5 20:24
 * Description: 策略类抽象接口, 计算不同交通工具需要的费用
 */
public interface IStrategy {
    int calculatePrice(int distance);
}
