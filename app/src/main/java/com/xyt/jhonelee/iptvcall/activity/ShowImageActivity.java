package com.xyt.jhonelee.iptvcall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xyt.jhonelee.iptvcall.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class ShowImageActivity  extends Activity{
    @BindView(R.id.image)
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimage);
        ButterKnife.bind(this);
        Glide.with(this).load(getIntent().getStringExtra("url")).into(imageView);
    }
}
