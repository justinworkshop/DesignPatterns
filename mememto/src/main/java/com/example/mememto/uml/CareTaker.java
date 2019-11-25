package com.example.mememto.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CareTaker
 * Author: wei.zheng
 * Date: 2019/11/25 21:07
 * Description: 负责存储备忘录
 */
public class CareTaker {
    private Memento memento;

    public void storeMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento restoreMemento() {
        return memento;
    }
}
