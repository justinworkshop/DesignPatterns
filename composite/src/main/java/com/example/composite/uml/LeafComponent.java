package com.example.composite.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: LeafComponent
 * Author: wei.zheng
 * Date: 2019/11/7 21:26
 * Description: 具体叶子节点
 */
public class LeafComponent extends Component {
    public LeafComponent(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d("Leaf", "name:" + name);
    }
}
