package com.example.singleton.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SingletonLanHan
 * Author: wei.zheng
 * Date: 2019/11/19 21:07
 * Description: 懒汉
 * <p>
 * getInstance方法为同步方法，每次调用都会进行同步，会造成不必要的开销，不建议使用
 */
public class SingletonLanHan {
    private static SingletonLanHan sInstance;

    private SingletonLanHan() {

    }

    public static synchronized SingletonLanHan getInstance() {
        if (sInstance == null) {
            sInstance = new SingletonLanHan();
        }
        return sInstance;
    }
}
