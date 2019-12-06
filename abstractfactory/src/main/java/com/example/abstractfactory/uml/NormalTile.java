package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: NormalTile
 * Author: wei.zheng
 * Date: 2019/12/5 21:19
 * Description: 普通轮胎具体产品
 */
public class NormalTile implements ITile {
    @Override
    public void desc() {
        Log.i("Tile", "普通轮胎");
    }
}
