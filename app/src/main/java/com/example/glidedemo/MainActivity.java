package com.example.glidedemo;

import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.cleardisk).setOnClickListener(this);
        ImageView imageView = findViewById(R.id.iv);
        File file = new File(Environment.getExternalStorageDirectory() + "/143506661.gif");
        ImageLoader.loadImage(this, ImageConfigImpl
                .builder()
//                .load("http://www.pptbz.com/pptpic/UploadFiles_6909/201203/2012031220134655.jpg")
//                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1553080429511&di=d50e7e730d3572105b631d8e66a7f01c&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fd72001fdc7b2cec03f8d5b3ef0e0bd073c16b20066480-OnyN4l_fw658")
//                .load(R.mipmap.test)
//                .load(file)
                .load(R.mipmap.test)
//                .imageRadius(100)
                .placeholder(R.mipmap.placeholder)
//                .errorImage(R.mipmap.ic_launcher_round)
                .imageView(imageView)
//                .centerCrop()
//                .circleCrop()
                .roundedCorner(5000)
                .listener(new OnImageLoadListener() {
                    @Override
                    public void onLoadFailed(Object model) {
                        Log.i("------onLoadFailed",model.toString());
                    }

                    @Override
                    public void onResourceReady(Drawable resource, Object model) {
                        Log.i("------onResourceReady",model.toString());
                    }
                })
                .build());
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.cleardisk:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        ImageLoader.clearDiskCache(MainActivity.this);
                    }
                }).start();
                break;
            case R.id.clearmemory:
                ImageLoader.clearMemory(v.getContext());
                break;
            default:
        }
    }
}
