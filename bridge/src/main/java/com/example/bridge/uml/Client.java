package com.example.bridge.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2020/1/14 8:27
 * Description: 桥接模式用户类
 */
public class Client {
    public static void main(String[] args) {
        AbstractAdditive milk = new Milk();
        AbstractAdditive sugar = new Sugar();

        // 大杯加奶
        LargeCoffee largeCoffeeMilk = new LargeCoffee(milk);
        largeCoffeeMilk.makeCoffee();

        // 小杯加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
    }
}
