package com.example.visitor.uml;

import java.util.Random;

/**
 * Copyright (C), 2016-2020
 * FileName: AbstractClub
 * Author: wei.zheng
 * Date: 2019/12/21 18:49
 * Description: 俱乐部抽象类
 */
public abstract class AbstractClub {
    private String name;
    private int payTaxes;

    public AbstractClub(String name) {
        this.name = name;
        payTaxes = new Random().nextInt(100);
    }

    public String getName() {
        return name;
    }

    public int getPayTaxes() {
        return payTaxes;
    }

    public abstract void accept(AbstractVisitor visitor);
}
