package com.example.glidedemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.Nullable;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;


/**
 * @author : zzj
 * Date : 2019/3/19
 */
public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy {
    @Override
    public void displayImage(Context context, final ImageConfig config) {
        RequestBuilder<Drawable> requestBuilder = Glide.with(context).load(config.getModel());
        if (config.centerCrop) {
            requestBuilder = requestBuilder.centerCrop();
        }
        if (config.circleCrop) {
            requestBuilder = requestBuilder.circleCrop();
        }
        if (config.roundedCorner > 0) {
            requestBuilder = requestBuilder.transform(new RoundedCorners(config.roundedCorner));
        }
        requestBuilder
                .placeholder(config.getPlaceholder())
                .error(config.getErrorImage())
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Log.i("-----", e.getMessage());
                        if (config.getLoadListener() != null) {
                            config.getLoadListener().onLoadFailed(model);
                        }
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        Log.i("------", "chenggong");
                        if (config.getLoadListener() != null) {
                            config.getLoadListener().onResourceReady(resource, model);
                        }
                        return false;
                    }
                })
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
//                .fitCenter()
//                .override()
//                .dontAnimate()
//                .transition(DrawableTransitionOptions.withCrossFade())
                .into(config.getImageView());
    }
}
