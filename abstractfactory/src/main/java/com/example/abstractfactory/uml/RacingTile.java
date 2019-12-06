package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: RacingTile
 * Author: wei.zheng
 * Date: 2019/12/5 21:21
 * Description: 赛车轮胎具体产品类
 */
public class RacingTile implements ITile {
    @Override
    public void desc() {
        Log.i("Tile", "赛车轮胎");
    }
}
