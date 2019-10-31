package com.example.flyweight.uml;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright (C), 2015-2019
 * FileName: TicketFactory
 * Author: wei.zheng
 * Date: 2019/10/31 21:00
 * Description: 工厂类
 */
public class TicketFactory {
    static Map<String, Ticket> sTickerMap = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTickerMap.containsKey(key)) {
            return sTickerMap.get(key);
        } else {
            Ticket ticket = new ConcreteTicket(from, to);
            sTickerMap.put(key, ticket);
            return ticket;
        }
    }
}
