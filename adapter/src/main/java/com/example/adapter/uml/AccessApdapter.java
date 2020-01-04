package com.example.adapter.uml;

/**
 * Copyright (C), 2016-2020
 * FileName: AccessApdapter
 * Author: wei.zheng
 * Date: 2020/1/4 10:09
 * Description: Adapter角色，适配TFCardAdaptee （代理的方式连接到Adaptee角色）
 */
public class AccessApdapter implements IAccessSDCardTarget {
    private TFCardAdaptee tfCardAdaptee;

    public AccessApdapter(TFCardAdaptee tfCardAdaptee) {
        this.tfCardAdaptee = tfCardAdaptee;
    }

    @Override
    public String readSDCard() {
        return tfCardAdaptee.readTFCard();
    }

    @Override
    public void writeSDCard(String content) {
        tfCardAdaptee.writeTFCard(content);
    }
}
