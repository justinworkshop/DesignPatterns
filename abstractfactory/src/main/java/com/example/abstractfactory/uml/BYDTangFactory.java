package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: BYDTangFactory
 * Author: wei.zheng
 * Date: 2019/12/5 21:29
 * Description: BYD 唐具体工厂：进口发动机、赛车轮胎
 */
public class BYDTangFactory extends AbstractFactory {
    public BYDTangFactory() {
        Log.i("Factory", "BYD唐 工厂");
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public ITile createTile() {
        return new RacingTile();
    }
}
