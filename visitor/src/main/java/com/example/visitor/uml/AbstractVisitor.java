package com.example.visitor.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractVisitor
 * Author: wei.zheng
 * Date: 2019/12/21 18:53
 * Description: 访问者抽象类
 */
public abstract class AbstractVisitor {
    public abstract void visit(FootballClub club);

    public abstract void visit(BasketballClub club);
}
