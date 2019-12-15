package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: UpCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:18
 * Description: UpCommand
 */
public class UpCommand implements ICommand {
    private MechineReceiver mechineReceiver;

    public UpCommand(MechineReceiver mechineReceiver) {
        this.mechineReceiver = mechineReceiver;
    }

    @Override
    public void execute() {
        mechineReceiver.toUp();
    }
}
