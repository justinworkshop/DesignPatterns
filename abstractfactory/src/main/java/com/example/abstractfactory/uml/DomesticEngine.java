package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: DomesticEngine
 * Author: wei.zheng
 * Date: 2019/12/5 21:23
 * Description: 国产发动机具体产品类
 */
public class DomesticEngine implements IEngine {
    @Override
    public void desc() {
        Log.i("Engine", "国产发动机");
    }
}
