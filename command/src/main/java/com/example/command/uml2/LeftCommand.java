package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: LeftCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:19
 * Description: LeftCommand
 */
public class LeftCommand implements ICommand {
    private MechineReceiver mechineReceiver;

    public LeftCommand(MechineReceiver mechineReceiver) {
        this.mechineReceiver = mechineReceiver;
    }

    @Override
    public void execute() {
        mechineReceiver.toLeft();
    }
}
