package com.example.facade.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: CameraImpl
 * Author: wei.zheng
 * Date: 2020/1/9 9:20
 * Description: 相机实现类
 */
public class CameraImpl implements ICamera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
