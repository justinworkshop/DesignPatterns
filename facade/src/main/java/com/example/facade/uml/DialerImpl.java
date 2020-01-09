package com.example.facade.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: DialerImpl
 * Author: wei.zheng
 * Date: 2020/1/9 9:21
 * Description: 拨号器实现类
 */
public class DialerImpl implements IDialer {
    @Override
    public void dial() {
        System.out.println("拨打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}
