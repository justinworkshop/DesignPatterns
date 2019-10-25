package com.example.mediator.example;

/**
 * Copyright (C), 2015-2019
 * FileName: CdDriveColleague
 * Author: wei.zheng
 * Date: 2019/10/25 22:32
 * Description: CdDrive同事
 */
public class CdDriveColleague extends Colleague {
    public CdDriveColleague(Mediator mediator) {
        super(mediator);
    }

    public void load() {
        System.out.println("准备CD");
        mediator.changed(this);
    }

    public void play(){
        System.out.println("播放");
    }
}
