package com.example.iterator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/17 9:44
 * Description: 迭代器模式用户类
 */
public class Client {
    public static void main(String[] args) {
        IAggregate<String> sports = new ConcreteAggregate<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Volleyball");

        IIterator<String> iterator = sports.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
