package com.example.glidedemo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.widget.ImageView;

import java.io.File;
import java.net.URL;

/**
 * @author : zzj
 * Date : 2019/3/19
 */
public class ImageConfigImpl extends ImageConfig {
    private int imageRadius;//图片每个圆角的大小
    private int blurValue;//高斯模糊值, 值越大模糊效果越大


    private ImageConfigImpl(Builder builder) {
        this.imageView = builder.imageView;
        this.placeholder = builder.placeholder;
        this.blurValue = builder.blurValue;
        this.imageRadius = builder.imageRadius;
        this.errorImage = builder.errorImage;
        this.centerCrop = builder.centerCrop;
        this.circleCrop = builder.circleCrop;
        this.roundedCorner = builder.roundedCorner;
        this.loadListener = builder.loadListener;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ImageView imageView;
        private int imageRadius;//图片每个圆角的大小
        private int blurValue;//高斯模糊值, 值越大模糊效果越大
        private int placeholder;
        private int errorImage;
        private boolean centerCrop;
        private boolean circleCrop;
        private int roundedCorner;
        private OnImageLoadListener loadListener;
        private Object model;

        private Builder() {
        }

        public Builder imageView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Builder imageRadius(int imageRadius) {
            this.imageRadius = imageRadius;
            return this;
        }

        public Builder blurValue(int blurValue) {
            this.blurValue = blurValue;
            return this;
        }

        public Builder placeholder(int placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public Builder errorImage(int errorImage) {
            this.errorImage = errorImage;
            return this;
        }

        public Builder centerCrop() {
            this.centerCrop = true;
            return this;
        }

        public Builder circleCrop() {
            this.circleCrop = true;
            return this;
        }

        public Builder roundedCorner(int roundedCorner) {
            this.roundedCorner = roundedCorner;
            return this;
        }

        public Builder listener(OnImageLoadListener loadListener) {
            this.loadListener = loadListener;
            return this;
        }

        public Builder load(Object model) {
            this.model = model;
            return this;
        }

        public Builder load(File file) {
            this.model = file;
            return this;
        }

        public Builder load(Bitmap bitmap) {
            this.model = bitmap;
            return this;
        }

        public Builder load(Drawable drawable) {
            this.model = drawable;
            return this;
        }

        public Builder load(String string) {
            this.model = string;
            return this;
        }

        public Builder load(Uri uri) {
            this.model = uri;
            return this;
        }

        public Builder load(@RawRes @DrawableRes Integer resourceId) {
            this.model = resourceId;
            return this;
        }

        public Builder load(URL url) {
            this.model = url;
            return this;
        }

        public Builder load(byte[] model) {
            this.model = model;
            return this;
        }

        public ImageConfigImpl build() {
            return new ImageConfigImpl(this);
        }
    }
}

