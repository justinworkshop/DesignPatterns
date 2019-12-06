package com.example.abstractfactory.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: ImportEngine
 * Author: wei.zheng
 * Date: 2019/12/5 21:24
 * Description: 进口发动机具体产品类
 */
public class ImportEngine implements IEngine {
    @Override
    public void desc() {
        Log.i("Engine", "进口发动机");
    }
}
