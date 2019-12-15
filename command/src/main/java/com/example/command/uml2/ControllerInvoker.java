package com.example.command.uml2;

/**
 * Copyright (C), 2016-2020
 * FileName: ControllerInvoker
 * Author: wei.zheng
 * Date: 2019/12/15 9:22
 * Description: 控制器Invoker
 */
public class ControllerInvoker {
    private UpCommand upCommand;
    private DownCommand downCommand;
    private LeftCommand leftCommand;
    private RightCommand rightCommand;

    public void setUpCommand(UpCommand upCommand) {
        this.upCommand = upCommand;
    }

    public void setDownCommand(DownCommand downCommand) {
        this.downCommand = downCommand;
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
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
