package com.example.glidedemo;


import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;

import java.lang.annotation.Annotation;

/**
 * @author : zzj
 * Date : 2019/3/20
 */
public class MyGlideModule extends AppGlideModule {
    @Override
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder builder) {
        super.applyOptions(context, builder);
        //master
        //master2
        //master3

    }
}
