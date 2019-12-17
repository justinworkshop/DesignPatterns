package com.example.iterator.uml;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2016-2020
 * FileName: ConcreteIterator
 * Author: wei.zheng
 * Date: 2019/12/17 9:38
 * Description: 具体迭代器
 */
public class ConcreteIterator<T> implements IIterator<T> {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T object = null;
        if (hasNext()) {
            object = list.get(cursor++);
        }
        return object;
    }
}
