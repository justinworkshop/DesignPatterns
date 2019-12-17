package com.example.iterator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: IAggregate
 * Author: wei.zheng
 * Date: 2019/12/17 9:37
 * Description: 容器抽象接口
 */
public interface IAggregate<T> {
    void add(T object);

    void remote(T object);

    IIterator<T> iterator();
}
