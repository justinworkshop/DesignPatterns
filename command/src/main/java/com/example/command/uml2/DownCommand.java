package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: DownCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:19
 * Description: DownCommand
 */
public class DownCommand implements ICommand {
    private MachineReceiver machineReceiver;

    public DownCommand(MachineReceiver machineReceiver) {
        this.machineReceiver = machineReceiver;
    }

    @Override
    public void execute() {
        machineReceiver.toDown();
    }
}
