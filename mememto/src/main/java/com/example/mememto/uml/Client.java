package com.example.mememto.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/11/25 21:16
 * Description: 用户类
 */
public class Client {
    public static void main(String[] args) {
        // 玩游戏
        GameOriginator game = new GameOriginator();
        game.play();

        // 保持数据
        CareTaker careTaker = new CareTaker();
        careTaker.storeMemento(game.createMemento());

        // 退出
        game.quit();

        // 恢复数据
        GameOriginator newGame = new GameOriginator();
        newGame.restore(careTaker.restoreMemento());
        newGame.play();

    }
}
