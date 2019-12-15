package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: RightCommand
 * Author: wei.zheng
 * Date: 2019/12/13 21:19
 * Description: RightCommand
 */
public class RightCommand implements ICommand {
    private MechineReceiver mechineReceiver;

    public RightCommand(MechineReceiver mechineReceiver) {
        this.mechineReceiver = mechineReceiver;
    }

    @Override
    public void execute() {
        mechineReceiver.toRight();
    }
}
