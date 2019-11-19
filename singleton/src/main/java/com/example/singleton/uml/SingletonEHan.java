package com.example.singleton.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SingletonEHan
 * Author: wei.zheng
 * Date: 2019/11/19 21:08
 * Description: 饿汉
 *
 * 声明时就进行初始化，一般建议在使用时才初始化，不推荐使用。
 */
public class SingletonEHan {
    private static final SingletonEHan sInstance = new SingletonEHan();

    private SingletonEHan() {

    }

    public static SingletonEHan getInstance() {
        return sInstance;
    }
}
