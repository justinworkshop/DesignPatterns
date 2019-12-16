package com.example.observer.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteObserverA
 * Author: wei.zheng
 * Date: 2019/12/16 9:24
 * Description: 具体观察者A
 */
public class ConcreteObserverA implements IObserver {
    @Override
    public void update(String content) {
        System.out.println("ConcreteObserverA receive update: " + content);
    }
}
