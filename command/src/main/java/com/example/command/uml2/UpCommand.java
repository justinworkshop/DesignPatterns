package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: UpCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:18
 * Description: UpCommand，持有Receiver引用，调用Receiver的方法实现请求
 */
public class UpCommand implements ICommand {
    private MachineReceiver machineReceiver;

    public UpCommand(MachineReceiver machineReceiver) {
        this.machineReceiver = machineReceiver;
    }

    @Override
    public void execute() {
        machineReceiver.toUp();
    }
}
