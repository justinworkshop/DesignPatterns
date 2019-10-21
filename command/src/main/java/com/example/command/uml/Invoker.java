package com.example.command.uml;

/**
 * Copyright (C), 2019-2020
 * FileName: Invoker
 * Author: wei.zheng
 * Date: 2019/10/20 9:37
 * Description: 请求者类
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
