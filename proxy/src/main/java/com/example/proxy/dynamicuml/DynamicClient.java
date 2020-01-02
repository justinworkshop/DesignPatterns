package com.example.proxy.dynamicuml;

import com.example.proxy.uml.ISubject;
import com.example.proxy.uml.RealSubject;

import java.lang.reflect.Proxy;

/**
 * Copyright (C), 2016-2020
 * FileName: DynamicClient
 * Author: wei.zheng
 * Date: 2019/12/31 9:25
 * Description: 动态代理用户类
 */
public class DynamicClient {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();

        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();

        ISubject proxySubject = (ISubject) Proxy.newProxyInstance(classLoader,new Class[]{ISubject.class},dynamicProxy);
        proxySubject.visit();

    }
}
