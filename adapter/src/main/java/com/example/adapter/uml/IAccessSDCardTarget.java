package com.example.adapter.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: IAccessSDCardTarget
 * Author: wei.zheng
 * Date: 2020/1/4 10:05
 * Description: Target角色，抽象接口，读写SDCard
 */
public interface IAccessSDCardTarget {
    String readSDCard();

    void writeSDCard(String content);
}
