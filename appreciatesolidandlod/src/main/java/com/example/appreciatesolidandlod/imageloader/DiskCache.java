package com.example.appreciatesolidandlod.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Copyright (C), 2015-2019
 * FileName: DiskCache
 * Author: wei.zheng
 * Date: 2019/11/1 23:05
 * Description: 磁盘缓存实现类
 */
public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache/";

    @Override
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                CloseUtil.closeQuietly(fos);
            }
        }
    }
}
