package com.xyt.jhonelee.iptvcall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.activity_main)
    RelativeLayout layout;
    private MetroViewBorderImpl viewBorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewBorder = new MetroViewBorderImpl(this);
        MotroViewUtil.initView(viewBorder,layout);
    }
}
