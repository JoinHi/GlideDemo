package com.example.glidedemo;

import android.graphics.drawable.Drawable;

/**
 * @author : zzj
 * Date : 2019/3/20
 */
public interface OnImageLoadListener {
    void onLoadFailed(Object model);

    void onResourceReady(Drawable resource, Object model);
}
