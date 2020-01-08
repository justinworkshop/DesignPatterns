package com.example.flyweight.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteParamsFlyweight
 * Author: wei.zheng
 * Date: 2020/1/8 9:03
 * Description: $des$
 */
public class ConcreteParamsFlyweight implements IParamsFlyweight {
    private String direction;
    private float speed;

    public ConcreteParamsFlyweight(String direction) {
        this.direction = direction;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void showParams() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ConcreteParamsFlyweight{" +
                "direction='" + direction + '\'' +
                ", speed=" + speed +
                '}';
    }
}
