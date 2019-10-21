package com.example.command.uml;

/**
 * Copyright (C), 2019-2020
 * FileName: ConcreteCommand
 * Author: wei.zheng
 * Date: 2019/10/20 9:37
 * Description: 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
