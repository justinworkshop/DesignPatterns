package com.example.template.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/18 21:19
 * Description: 模板方法模式用户类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteA concreteA = new ConcreteA();
        ConcreteB concreteB = new ConcreteB();

        // 流程一样，但是两个类具体实现不同
        concreteA.execute();
        concreteB.execute();
    }
}
