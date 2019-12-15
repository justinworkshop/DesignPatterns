package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: Client2
 * Author: wei.zheng
 * Date: 2019/12/15 9:25
 * Description: 命令模式用户使用类
 */
public class Client2 {

    public static void main(String[] args) {
        MachineReceiver machineReceiver = new MachineReceiver();

        UpCommand upCommand = new UpCommand(machineReceiver);
        DownCommand downCommand = new DownCommand(machineReceiver);
        LeftCommand leftCommand = new LeftCommand(machineReceiver);
        RightCommand rightCommand = new RightCommand(machineReceiver);

        ControllerInvoker invoker = new ControllerInvoker();
        invoker.setUpCommand(upCommand);
        invoker.setDownCommand(downCommand);
        invoker.setLeftCommand(leftCommand);
        invoker.setRightCommand(rightCommand);

        invoker.toUp();
        invoker.toDown();
        invoker.toLeft();
        invoker.toRight();
    }
}
