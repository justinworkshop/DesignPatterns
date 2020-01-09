package com.example.facade.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: PhoneFacade
 * Author: wei.zheng
 * Date: 2020/1/9 9:16
 * Description: 用手机来举例描述外观模式，拍照和拨号是常用功能，其实内部由两个子系统分别实现，用户无感知
 */
public class PhoneFacade {
    private ICamera camera;
    private IDialer dialer;

    public PhoneFacade() {
        camera = new CameraImpl();
        dialer = new DialerImpl();
    }

    public void takePicture() {
        camera.open();
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }

    public void dial() {
        dialer.dial();
    }

    public void hangup() {
        dialer.hangup();
    }
}
