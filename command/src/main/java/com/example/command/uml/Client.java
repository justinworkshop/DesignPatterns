package com.example.command.uml;

/**
 * Copyright (C), 2019-2020
 * FileName: Client2
 * Author: wei.zheng
 * Date: 2019/10/20 9:37
 * Description: 命令模式客户类
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
