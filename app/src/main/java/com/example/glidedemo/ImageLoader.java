package com.example.glidedemo;

import android.content.Context;

import com.bumptech.glide.Glide;

/**
 * @author : zzj
 * Date : 2019/3/19
 */
public final class ImageLoader {
    private static final BaseImageLoaderStrategy STRATEGY;

    static {
        STRATEGY = new GlideImageLoaderStrategy();
    }

    public static void loadImage(Context context, ImageConfig config) {
        STRATEGY.displayImage(context, config);
    }

    /**
     * this method should always be called on a background thread, since it is a blocking call.
     */
    public static void clearDiskCache(Context context) {
        if (STRATEGY instanceof GlideImageLoaderStrategy) {
            Glide.get(context).clearDiskCache();
        }
    }

    public static void clearMemory(Context context) {
        if (STRATEGY instanceof GlideImageLoaderStrategy) {
            Glide.get(context).clearMemory();
        }
    }
}
