package com.example.prototype.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/11/25 22:06
 * Description: 用户类
 */
public class Client {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("li yun long");
        hero1.setAge(50);
        hero1.setSect("ni tui zi");
        Log.d("Hero", hero1.toString());

        Hero hero2 = hero1.clone();
        hero2.setName("chu yun fei");
        hero2.setSect("ke ban");
        Log.d("Hero", hero2.toString());
    }
}
