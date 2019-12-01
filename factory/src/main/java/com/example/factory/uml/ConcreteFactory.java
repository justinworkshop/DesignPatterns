package com.example.factory.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteFactory
 * Author: wei.zheng
 * Date: 2019/12/1 20:10
 * Description: ConcreteFactory
 */
public class ConcreteFactory extends AbstractFactory {

    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> clz) {
        AbstractProduct p = null;
        try {
            p = (AbstractProduct) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
