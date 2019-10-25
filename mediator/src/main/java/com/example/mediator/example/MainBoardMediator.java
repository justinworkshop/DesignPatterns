package com.example.mediator.example;

/**
 * Copyright (C), 2015-2019
 * FileName: MainBoardMediator
 * Author: wei.zheng
 * Date: 2019/10/25 22:30
 * Description: 具体中介者-主板
 */
public class MainBoardMediator extends Mediator {

    private CpuColleague cpuColleague;
    private CdDriveColleague cdDriveColleague;

    /**
     * 如下，通过中介来协调cpu与CD的交互
     *
     * @param colleague
     */
    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CdDriveColleague) {
            cpuColleague.check();
        } else if (colleague instanceof CpuColleague) {
            cdDriveColleague.play();
            System.out.println("已经开始播放了");
        }
    }

    public void setCdDriveColleague(CdDriveColleague cdDriveColleague) {
        this.cdDriveColleague = cdDriveColleague;
    }

    public void setCpuColleague(CpuColleague cpuColleague) {
        this.cpuColleague = cpuColleague;
    }
}
