package com.example.visitor.uml;

import java.util.Random;

/**
 * Copyright (C), 2016-2020
 * FileName: FootballClub
 * Author: wei.zheng
 * Date: 2019/12/21 19:08
 * Description: 足球俱乐部
 */
public class FootballClub extends AbstractClub {
    private int championNum;

    public FootballClub(String name) {
        super(name);
        championNum = new Random().nextInt(10);
    }

    public int getChampionNum() {
        return championNum;
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }
}
