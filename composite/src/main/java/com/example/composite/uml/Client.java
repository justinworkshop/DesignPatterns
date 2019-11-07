package com.example.composite.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: wei.zheng
 * Date: 2019/11/7 21:32
 * Description: 用户类
 */
public class Client {

    public static void main(String[] args) {

        BranchComponent root = new BranchComponent("root");

        BranchComponent branch1 = new BranchComponent("Branch1");
        BranchComponent branch2 = new BranchComponent("Branch2");

        LeafComponent leaf1 = new LeafComponent("Leaf1");
        LeafComponent leaf2 = new LeafComponent("Leaf2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}
