package com.example.visitor.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: BasketballClub
 * Author: wei.zheng
 * Date: 2019/12/21 19:19
 * Description: 篮球俱乐部
 */
public class BasketballClub extends AbstractClub {
    private float attendanceRate;

    public BasketballClub(String name) {
        super(name);
        attendanceRate = 0.88f;
    }

    public float getAttendanceRate() {
        return attendanceRate;
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }
}
