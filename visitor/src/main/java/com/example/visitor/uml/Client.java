package com.example.visitor.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/12/21 19:30
 * Description: 访问者模式用户类
 */
public class Client {
    public static void main(String[] args) {
        VisitorReport report = new VisitorReport();

        System.out.println("MayorVisitor 访问数据");
        report.showReport(new MayorVisitor());

        System.out.println("FinanceMinisterVisitor 访问数据");
        report.showReport(new FinanceMinisterVisitor());
    }
}
