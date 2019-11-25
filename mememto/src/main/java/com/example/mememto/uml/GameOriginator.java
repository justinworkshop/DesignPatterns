package com.example.mememto.uml;

import android.util.Log;

/**
 * Copyright (C), 2016-2020
 * FileName: GameOriginator
 * Author: wei.zheng
 * Date: 2019/11/25 21:13
 * Description: 负责创建备忘录
 */
public class GameOriginator {
    private static final String TAG = "GameOriginator";

    private int version;
    private String name;
    private int mode;
    private int status;
    private int progress;

    public void play() {
        Log.d(TAG, "play");
    }

    public void quit() {
        Log.d(TAG, "quit");
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mode = mode;
        memento.status = status;
        memento.progress = progress;
        return memento;
    }

    public void restore(Memento memento) {
        this.mode = memento.mode;
        this.status = memento.status;
        this.progress = memento.progress;
    }
}
