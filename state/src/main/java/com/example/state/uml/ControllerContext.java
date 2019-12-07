package com.example.state.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: ControllerContext
 * Author: wei.zheng
 * Date: 2019/12/7 21:41
 * Description: 遥控器Context类
 */
public class ControllerContext {
    private IState mState;

    public void setState(IState state) {
        this.mState = state;
    }

    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机");
    }

    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机");
    }

    public void nextChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void volumeUp() {
        mState.volumeUp();
    }

    public void volumeDown() {
        mState.volumeDown();
    }
}
