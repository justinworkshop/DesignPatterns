package com.example.appreciatesolidandlod.imageloader;

import android.graphics.Bitmap;

/**
 * Copyright (C), 2015-2019
 * FileName: ImageCache
 * Author: wei.zheng
 * Date: 2019/11/1 23:02
 * Description: 缓存抽象接口
 */
public interface ImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bitmap);
}
