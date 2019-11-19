package com.example.singleton.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SingletonStaticInnerClass
 * Author: wei.zheng
 * Date: 2019/11/19 21:12
 * Description: 静态内部类
 *
 * 使用时初始化，第一次调用getInstance会导致JVM家长内部类，这种方式保证线程安全，也保证单例对象的唯一性，推荐使用
 */
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {

    }

    public static SingletonStaticInnerClass getInstance() {
        return SingletonStaticInnerClassHolder.sInstance;
    }

    private static final class SingletonStaticInnerClassHolder {
        private static final SingletonStaticInnerClass sInstance = new SingletonStaticInnerClass();
    }
}
