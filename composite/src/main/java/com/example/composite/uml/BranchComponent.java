package com.example.composite.uml;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: BranchComponent
 * Author: wei.zheng
 * Date: 2019/11/7 21:27
 * Description: 具体枝干节点
 */
public class BranchComponent extends Component {
    private List<Component> components = new ArrayList<>();

    public BranchComponent(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.d("TAG", "name:" + name);
        if (null != components) {
            for (Component c : components) {
                c.doSomething();
            }
        }
    }

    public void addChild(Component child) {
        components.add(child);
    }

    public void removeChild(Component child) {
        components.remove(child);
    }

    public Component getChild(int index) {
        return components.get(index);
    }
}
