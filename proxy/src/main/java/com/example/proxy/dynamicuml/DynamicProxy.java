package com.example.proxy.dynamicuml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Copyright (C), 2016-2020
 * FileName: DynamicProxy
 * Author: wei.zheng
 * Date: 2019/12/31 9:23
 * Description: 动态代理类
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
