package com.example.appreciatesolidandlod.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Copyright (C), 2015-2019
 * FileName: ImageLoader
 * Author: wei.zheng
 * Date: 2019/11/1 23:09
 * Description: Image加载器
 * <p>
 * 一个示例说明面向对象6大原则
 * <p>
 * ImageCache为抽象接口，具体类只负责处理缓存, 满足单一原则SRP;
 * setImageCache通过注入不同的缓存实现类，达到扩展的目的，满足开闭原则OCP;
 * setImageCache方法的参数为抽象类，可以被任何子类替换，满足里氏替换原则LSP;
 * ImageLoader依赖抽象接口ImageCache，满足依赖倒置原则DIP;
 * Closeable接口工具类，关闭所有对象，满足接口隔离原则ISP;
 * ImageCache的具体实现类可以任意实现，ImageLoader无需关注，满足迪米特原则LOD.
 */
public class ImageLoader {
    // 图片缓存
    ImageCache mImageCache = new MemoryCache();
    // 线程是为CPU核心数
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public void setImageCache(ImageCache imageCache) {
        mImageCache = imageCache;
    }

    public void displayImage(String imageUrl, ImageView imageView) {
        Bitmap bitmap = mImageCache.get(imageUrl);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        // 图片无缓存，提交到线程池下载图片
        submitLoadRequest(imageUrl, imageView);

    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView) {
        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(imageUrl)) {
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(imageUrl, bitmap);
            }
        });
    }

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
