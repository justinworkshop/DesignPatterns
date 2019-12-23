package com.example.visitor.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: FinanceMinisterVisitor
 * Author: wei.zheng
 * Date: 2019/12/21 19:03
 * Description: 财政部长访问者，关心俱乐部的缴税额
 */
public class FinanceMinisterVisitor extends AbstractVisitor {
    @Override
    public void visit(FootballClub club) {
        System.out.println("俱乐部:" + club.getName() + ", 缴税额:" + club.getPayTaxes());
    }

    @Override
    public void visit(BasketballClub club) {
        System.out.println("俱乐部:" + club.getName() + ", 缴税额:" + club.getPayTaxes());
    }
}
