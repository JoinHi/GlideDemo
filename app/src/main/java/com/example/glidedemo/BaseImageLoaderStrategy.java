package com.example.glidedemo;

import android.content.Context;

/**
 * @author : zzj
 * Date : 2019/3/19
 */

public interface BaseImageLoaderStrategy<T extends ImageConfig> {
    void displayImage(Context context,T config);
}
