package com.example.observer.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/16 9:30
 * Description: 观察者模式用户类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        IObserver observerA = new ConcreteObserverA();
        IObserver observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        // 被观察者Subject改变内部状态，通知到各个观察者Observer
        subject.setState("Active");
        subject.notifyObservers();
    }
}
