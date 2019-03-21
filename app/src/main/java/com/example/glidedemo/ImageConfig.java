package com.example.glidedemo;

import android.widget.ImageView;

/**
 * @author : zzj
 * Date : 2019/3/19
 */
public class ImageConfig {
    protected ImageView imageView;
    protected int placeholder;//占位符
    protected int errorImage;
    protected boolean centerCrop;
    protected boolean circleCrop;
    protected int roundedCorner;
    protected OnImageLoadListener loadListener;
    protected Object model;

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(int placeholder) {
        this.placeholder = placeholder;
    }

    public int getErrorImage() {
        return errorImage;
    }

    public void setErrorImage(int errorImage) {
        this.errorImage = errorImage;
    }

    public boolean isCenterCrop() {
        return centerCrop;
    }

    public void setCenterCrop(boolean centerCrop) {
        this.centerCrop = centerCrop;
    }

    public boolean isCircleCrop() {
        return circleCrop;
    }

    public void setCircleCrop(boolean circleCrop) {
        this.circleCrop = circleCrop;
    }

    public int getRoundedCorner() {
        return roundedCorner;
    }

    public void setRoundedCorner(int roundedCorner) {
        this.roundedCorner = roundedCorner;
    }

    public OnImageLoadListener getLoadListener() {
        return loadListener;
    }

    public void setLoadListener(OnImageLoadListener loadListener) {
        this.loadListener = loadListener;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }
}
