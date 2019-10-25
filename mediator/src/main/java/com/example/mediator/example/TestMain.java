package com.example.mediator.example;

/**
 * Copyright (C), 2015-2019
 * FileName: TestMain
 * Author: wei.zheng
 * Date: 2019/10/25 22:34
 * Description: 测试入口
 */
public class TestMain {

    /**
     * 中介者模式体会：
     * 中介者需要知道每个同事,
     * 每个同事也需要知道中介。
     * <p>
     * 将同事与同事见的n:n关系 ------>  中介与同事的1:n关系
     *
     * @param args
     */
    public static void main(String[] args) {
        MainBoardMediator mainBoardMediator = new MainBoardMediator();

        CpuColleague cpuColleague = new CpuColleague(mainBoardMediator);
        CdDriveColleague cdDriveColleague = new CdDriveColleague(mainBoardMediator);

        mainBoardMediator.setCpuColleague(cpuColleague);
        mainBoardMediator.setCdDriveColleague(cdDriveColleague);

        // CD加载资源，通知MainBoard中介，来协调CPU检测资源，再通过中介调用CD最后的播放
        cdDriveColleague.load();

    }
}
