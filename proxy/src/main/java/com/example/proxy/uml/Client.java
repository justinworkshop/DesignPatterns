package com.example.proxy.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/31 9:20
 * Description: 代理模式用户类
 */
public class Client {
    public static void main(String[] args) {
        ISubject realSubject = new RealSubject();

        ISubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }
}
