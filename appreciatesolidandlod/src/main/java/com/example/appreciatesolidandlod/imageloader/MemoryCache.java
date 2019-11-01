package com.example.appreciatesolidandlod.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Copyright (C), 2015-2019
 * FileName: MemoryCache
 * Author: wei.zheng
 * Date: 2019/11/1 23:03
 * Description: 内存缓存实现类
 */
public class MemoryCache implements ImageCache {
    private LruCache<String, Bitmap> mMemoryCache;

    public MemoryCache() {
        initMemoryCache();
    }

    private void initMemoryCache() {
        // 计算最大使用内存，单位为KB
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        // 取1/4作为缓存
        int cacheSize = maxMemory / 4;
        mMemoryCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    @Override
    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
    }
}
