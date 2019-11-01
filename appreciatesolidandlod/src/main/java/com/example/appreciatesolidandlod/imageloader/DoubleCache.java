package com.example.appreciatesolidandlod.imageloader;

import android.graphics.Bitmap;

/**
 * Copyright (C), 2015-2019
 * FileName: DoubleCache
 * Author: wei.zheng
 * Date: 2019/11/1 23:07
 * Description: 双缓冲实现类
 */
public class DoubleCache implements ImageCache {
    ImageCache mMemoryCache = new MemoryCache();
    ImageCache mDiskCache = new DiskCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }
}
