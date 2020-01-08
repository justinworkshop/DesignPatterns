package com.example.flyweight.uml2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright (C), 2016-2020
 * FileName: ParamsFlyweightFactory
 * Author: wei.zheng
 * Date: 2020/1/8 9:06
 * Description: 享元工厂即对象池
 */
public class ParamsFlyweightFactory {
    private static Map<String, IParamsFlyweight> sMap = new ConcurrentHashMap<>();

    public static IParamsFlyweight getParams(String direction) {
        String key = direction;

        if (sMap.containsKey(key)) {
            System.out.println("从对象池获取对象");
            return sMap.get(key);
        } else {
            System.out.println("创建新对象");
            ConcreteParamsFlyweight paramsFlyweight = new ConcreteParamsFlyweight(direction);
            paramsFlyweight.setSpeed(10.0f);
            sMap.put(key, paramsFlyweight);
            return paramsFlyweight;
        }
    }
}
