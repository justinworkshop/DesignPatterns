package com.example.flyweight.uml;

import java.util.Random;

/**
 * Copyright (C), 2015-2019
 * FileName: ConcreteTicket
 * Author: wei.zheng
 * Date: 2019/10/31 20:57
 * Description: 具体实现类
 */
public class ConcreteTicket implements Ticket {
    private String from;
    private String to;
    private String bunk;
    public int price;

    ConcreteTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void ShowTicketInfo(String bunk) {
        price = new Random().nextInt(30);
        System.out.println("购买从" + from + "到" + to + "的" + bunk + "火车票价格是：" + price);
    }
}
