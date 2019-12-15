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
        MechineReceiver mechineReceiver = new MechineReceiver();

        UpCommand upCommand = new UpCommand(mechineReceiver);
        DownCommand downCommand = new DownCommand(mechineReceiver);
        LeftCommand leftCommand = new LeftCommand(mechineReceiver);
        RightCommand rightCommand = new RightCommand(mechineReceiver);

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
