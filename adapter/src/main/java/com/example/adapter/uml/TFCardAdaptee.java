package com.example.adapter.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: TFCardAdaptee
 * Author: wei.zheng
 * Date: 2020/1/4 10:06
 * Description: Adaptee角色， 需要适配的角色，TFCard读写具体类
 */
public class TFCardAdaptee {
    public String readTFCard() {
        return "Hello, I am TF Card.";
    }

    public void writeTFCard(String content) {
        System.out.println("TF Card write success:" + content);
    }
}
