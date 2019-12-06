package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: BYDQinFactory
 * Author: wei.zheng
 * Date: 2019/12/5 21:27
 * Description: BYD 秦具体工厂类 ：国产发动机、普通轮胎
 */
public class BYDQinFactory extends AbstractFactory {
    public BYDQinFactory() {
        Log.i("Factory", "BYD秦 工厂");
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public ITile createTile() {
        return new NormalTile();
    }
}
