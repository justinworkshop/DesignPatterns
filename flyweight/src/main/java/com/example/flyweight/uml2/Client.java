package com.example.flyweight.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2020/1/8 9:10
 * Description: 享元模式用户类
 */
public class Client {
    public static void main(String[] args) {
        IParamsFlyweight forward = ParamsFlyweightFactory.getParams("FORWARD");
        forward.showParams();

        IParamsFlyweight backward = ParamsFlyweightFactory.getParams("BACKWARD");
        backward.showParams();

        IParamsFlyweight forward1 = ParamsFlyweightFactory.getParams("FORWARD");
        forward1.showParams();

        IParamsFlyweight backward2 = ParamsFlyweightFactory.getParams("BACKWARD");
        backward2.showParams();
    }
}
