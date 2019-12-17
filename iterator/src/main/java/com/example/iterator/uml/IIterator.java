package com.example.iterator.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: IIterator
 * Author: wei.zheng
 * Date: 2019/12/17 9:36
 * Description: 迭代器抽象接口
 */
public interface IIterator<T> {
    boolean hasNext();

    T next();
}
