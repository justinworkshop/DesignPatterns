package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: ControllerInvoker
 * Author: wei.zheng
 * Date: 2019/12/15 9:22
 * Description: 控制器Invoker，求请者角色，持有对应具体命令引用,调用命令方法完成请求
 */
public class ControllerInvoker {
    private ICommand upCommand;
    private ICommand downCommand;
    private ICommand leftCommand;
    private ICommand rightCommand;

    public void setUpCommand(ICommand upCommand) {
        this.upCommand = upCommand;
    }

    public void setDownCommand(ICommand downCommand) {
        this.downCommand = downCommand;
    }

    public void setLeftCommand(ICommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(ICommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void toUp() {
        upCommand.execute();
    }

    public void toDown() {
        downCommand.execute();
    }

    public void toLeft() {
        leftCommand.execute();
    }

    public void toRight() {
        rightCommand.execute();
    }
}
