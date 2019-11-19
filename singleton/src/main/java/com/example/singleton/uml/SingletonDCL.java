package com.example.singleton.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: SingletonDCL
 * Author: wei.zheng
 * Date: 2019/11/19 21:10
 * Description: Double check Lock
 *
 * 使用时初始化，第一层判空避免不必要的同步；第二层判空是为了在null的情况下创建实例。
 */
public class SingletonDCL {
    private static SingletonDCL sInstance;

    private SingletonDCL() {

    }

    public static SingletonDCL getInstance() {
        if (sInstance == null) {
            synchronized (SingletonDCL.class) {
                if (sInstance == null) {
                    sInstance = new SingletonDCL();
                }
            }
        }
        return sInstance;
    }
}
