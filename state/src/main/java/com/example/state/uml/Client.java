package com.example.state.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/7 21:44
 * Description: 状态模式用户类
 */
public class Client {
    public static void main(String[] args) {
        ControllerContext mController = new ControllerContext();

        // 开机
        mController.powerOn();
        mController.nextChannel();
        mController.volumeUp();

        // 关机
        mController.powerOff();
        mController.nextChannel();
        mController.volumeUp();
    }
}
