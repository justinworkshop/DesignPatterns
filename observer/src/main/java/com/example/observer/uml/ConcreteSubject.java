package com.example.observer.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteSubject
 * Author: wei.zheng
 * Date: 2019/12/16 9:27
 * Description: 具体被观察者, 模拟改变状态，通知各个观察者
 */
public class ConcreteSubject implements ISubject {
    private List<IObserver> observerList = new ArrayList<>();

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void attach(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update("state changed to " + state);
        }
    }
}
