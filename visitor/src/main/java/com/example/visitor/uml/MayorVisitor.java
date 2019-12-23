package com.example.visitor.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: MayorVisitor
 * Author: wei.zheng
 * Date: 2019/12/21 18:55
 * Description: 市长访问者, 关心足球俱乐部的冠军数量，关心篮球俱乐部的上座率
 */
public class MayorVisitor extends AbstractVisitor {
    @Override
    public void visit(FootballClub club) {
        System.out.println("俱乐部:" + club.getName() + ", 冠军数量:" + club.getChampionNum());
    }

    @Override
    public void visit(BasketballClub club) {
        System.out.println("俱乐部:" + club.getName() + ", 上座率:" + club.getAttendanceRate());
    }
}
