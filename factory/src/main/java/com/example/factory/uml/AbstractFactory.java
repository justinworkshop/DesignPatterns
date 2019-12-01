package com.example.factory.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractFactory
 * Author: wei.zheng
 * Date: 2019/12/1 20:09
 * Description: AbstractFactory
 */
public abstract class AbstractFactory {
    public abstract <T extends AbstractProduct> T createProduct(Class<T> clz);
}
