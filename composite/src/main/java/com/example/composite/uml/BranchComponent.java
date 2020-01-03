package com.example.composite.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: BranchComponent
 * Author: wei.zheng
 * Date: 2019/11/7 21:27
 * Description: 具体枝干节点
 */
public class BranchComponent extends AbstractComponent {
    private List<AbstractComponent> components = new ArrayList<>();

    public BranchComponent(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Branch :" + name);
        if (null != components) {
            for (AbstractComponent component : components) {
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(AbstractComponent child) {
        components.add(child);
    }

    @Override
    public AbstractComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public void removeChild(AbstractComponent child) {
        components.remove(child);
    }

}
