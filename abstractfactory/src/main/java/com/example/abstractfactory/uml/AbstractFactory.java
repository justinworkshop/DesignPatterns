package com.example.abstractfactory.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractFactory
 * Author: wei.zheng
 * Date: 2019/12/5 21:25
 * Description: 抽象工厂类
 */
public abstract class AbstractFactory {
    public abstract IEngine createEngine();

    public abstract ITile createTile();
}
