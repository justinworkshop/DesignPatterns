package com.example.state.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: IState
 * Author: wei.zheng
 * Date: 2019/12/7 21:36
 * Description: 抽象状态接口
 */
public interface IState {
    void nextChannel();

    void prevChannel();

    void volumeUp();

    void volumeDown();
}
