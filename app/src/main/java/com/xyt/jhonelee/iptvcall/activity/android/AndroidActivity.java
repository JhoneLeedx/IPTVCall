package com.xyt.jhonelee.iptvcall.activity.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.model.ResultsBean;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class AndroidActivity extends Activity{

    @BindView(R.id.layout)
    RelativeLayout mRefresh;
    @BindView(R.id.linearlayout)
    LinearLayout mLinear;
    @BindView(R.id.recycler)
    RecyclerView mRecycler;
    private MetroViewBorderImpl mMetro;
    private List<ResultsBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        ButterKnife.bind(this);
    }
    private void initView(){
        mMetro = new MetroViewBorderImpl(this);
        mMetro.attachTo(mRecycler);
    }
}
