package com.example.factory.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/1 20:11
 * Description: 用户类
 */
public class Client {

    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        ProductA productA = factory.createProduct(ProductA.class);
        productA.method();

        ProductB productB = factory.createProduct(ProductB.class);
        productB.method();

    }
}
