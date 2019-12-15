package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: DownCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:19
 * Description: DownCommand
 */
public class DownCommand implements ICommand {
    private MechineReceiver mechineReceiver;

    public DownCommand(MechineReceiver mechineReceiver) {
        this.mechineReceiver = mechineReceiver;
    }

    @Override
    public void execute() {
        mechineReceiver.toDown();
    }
}
