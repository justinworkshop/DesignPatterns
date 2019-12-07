package com.example.state.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: PowerOnState
 * Author: wei.zheng
 * Date: 2019/12/7 21:38
 * Description: 开机状态: 实现各个接口
 */
public class PowerOnState implements IState {
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void volumeUp() {
        System.out.println("音量up");
    }

    @Override
    public void volumeDown() {
        System.out.println("音量down");
    }
}
