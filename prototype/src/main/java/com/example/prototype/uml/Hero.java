package com.example.prototype.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: Hero
 * Author: wei.zheng
 * Date: 2019/11/25 21:59
 * Description: Hero为具体原型类
 * 1.什么是深拷贝？浅拷贝？
 * 2.值传递？引用传递？
 * 3.如何应用保护性拷贝？
 */
public class Hero implements Cloneable {
    private static final String TAG = "Hero";

    // 姓名
    private String name;
    // 年龄
    private int age;
    // 门派
    private String sect;

    public Hero() {
        Log.d(TAG, "构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    /***** 覆盖Object的clone方法， Cloneable为标识接口（空接口） *****/
    @Override
    protected Hero clone() {
        try {
            Hero hero = (Hero) super.clone();
//            hero.name = this.name;
//            hero.age = this.age;
//            hero.sect = this.sect;
            return hero;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sect='" + sect + '\'' +
                '}';
    }
}
