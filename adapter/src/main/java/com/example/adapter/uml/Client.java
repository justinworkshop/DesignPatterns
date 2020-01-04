package com.example.adapter.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2020/1/4 10:12
 * Description: 适配器模式用户类 (这里实为对象适配器模式)
 */
public class Client {
    public static void main(String[] args) {
        TFCardAdaptee tfCardAdaptee = new TFCardAdaptee();
        AccessApdapter accessApdapter = new AccessApdapter(tfCardAdaptee);

        String readResult = accessApdapter.readSDCard();
        System.out.println("readResult:" + readResult);
        accessApdapter.writeSDCard("Record adapter pattern uml code.");
    }
}
