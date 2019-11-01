package com.example.appreciatesolidandlod.imageloader;

import java.io.Closeable;
import java.io.IOException;

/**
 * Copyright (C), 2015-2019
 * FileName: CloseUtil
 * Author: wei.zheng
 * Date: 2019/11/1 23:37
 * Description: 对象关闭工具类
 */
public final class CloseUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
