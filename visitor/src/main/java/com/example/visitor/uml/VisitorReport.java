package com.example.visitor.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: VisitorReport
 * Author: wei.zheng
 * Date: 2019/12/21 19:31
 * Description: 访问者报告类
 */
public class VisitorReport {
    private List<AbstractClub> clubList = new ArrayList<>();

    public VisitorReport() {
        clubList.add(new FootballClub("广州恒大"));
        clubList.add(new FootballClub("广州富力"));
        clubList.add(new BasketballClub("广东宏远"));
    }

    public void showReport(AbstractVisitor visitor) {
        for (AbstractClub club : clubList) {
            club.accept(visitor);
        }
    }
}
