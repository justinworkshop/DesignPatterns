package com.example.observer.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteObserverB
 * Author: wei.zheng
 * Date: 2019/12/16 9:24
 * Description: 具体观察者B
 */
public class ConcreteObserverB implements IObserver {
    @Override
    public void update(String content) {
        System.out.println("ConcreteObserverB receive update: " + content);
    }
}
