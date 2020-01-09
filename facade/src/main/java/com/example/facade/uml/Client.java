package com.example.facade.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2020/1/9 9:23
 * Description: 外观模式/门面模式 用户类
 */
public class Client {
    public static void main(String[] args) {
        PhoneFacade phone = new PhoneFacade();

        phone.takePicture();
        phone.closeCamera();

        phone.dial();
        phone.hangup();
    }
}
