package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: LeftCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:19
 * Description: LeftCommand
 */
public class LeftCommand implements ICommand {
    private MachineReceiver machineReceiver;

    public LeftCommand(MachineReceiver machineReceiver) {
        this.machineReceiver = machineReceiver;
    }

    @Override
    public void execute() {
        machineReceiver.toLeft();
    }
}
