package com.example.decorator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteComponent
 * Author: wei.zheng
 * Date: 2020/1/6 9:20
 * Description: 组件具体实现类，动态扩展的目标对象
 */
public class ConcreteComponent extends AbstractComponent {
    @Override
    public void operate() {
        System.out.println("Base operate.");
    }
}
