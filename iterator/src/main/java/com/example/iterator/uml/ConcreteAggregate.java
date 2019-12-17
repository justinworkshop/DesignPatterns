package com.example.iterator.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteAggregate
 * Author: wei.zheng
 * Date: 2019/12/17 9:43
 * Description: 具体容器, 不同的容器可以有不同的迭代器实现，这里以List为例；还可以是Array or Map
 */
public class ConcreteAggregate<T> implements IAggregate<T> {
    private List<T> list = new ArrayList();

    @Override
    public void add(T object) {
        list.add(object);
    }

    @Override
    public void remote(T object) {
        list.remove(object);
    }

    @Override
    public IIterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
