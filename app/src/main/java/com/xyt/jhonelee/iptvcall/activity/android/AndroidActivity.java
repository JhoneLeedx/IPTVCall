package com.xyt.jhonelee.iptvcall.activity.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.xyt.jhonelee.iptvcall.DpiUtil;
import com.xyt.jhonelee.iptvcall.MotroViewUtil;
import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.activity.ShowAndroidActivity;
import com.xyt.jhonelee.iptvcall.bean.ResultsBean;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class AndroidActivity extends Activity implements AndroidView,AndroidListener{

    @BindView(R.id.ll)
    protected LinearLayout mLinear;
    @BindView(R.id.recyclerview)
    protected RecyclerView mRecycler;
    @BindView(R.id.rl_loading)
    protected RelativeLayout mRlLoading;

    private MetroViewBorderImpl mMetro;
    private List<ResultsBean> mList;
    private AndroidItemAdapter adapter;

    private  int pageNow = 1;
    private AndroidPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        ButterKnife.bind(this);
        mMetro = new MetroViewBorderImpl(this);
        mMetro.setBackgroundResource(R.drawable.border_color);
        initView();
    }
    private void initView(){

        presenter = new AndroidPresenter(this);
        presenter.showAndroid(20,1);
        mList = new ArrayList<>();

        GridLayoutManager manager=null;
        if (DpiUtil.getTVOrPhone(this)){
            manager = new GridLayoutManager(this,2);
        }else {
            manager = new GridLayoutManager(this,5);
        }
        mRecycler.setLayoutManager(manager);
        mMetro.attachTo(mRecycler);
        mRecycler.setFocusable(false);
        adapter = new AndroidItemAdapter(this,mList,this);
        mRecycler.setAdapter(adapter);


        MotroViewUtil.initView(mMetro,mLinear);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mList.clear();
    }

    @Override
    public void StartAndroid(ResultsBean bean) {
        Intent intent = new Intent(this, ShowAndroidActivity.class);
        intent.putExtra("url",bean.getUrl());
        startActivity(intent);
    }

    @Override
    public void showProgress() {
        mRlLoading.setVisibility(View.VISIBLE);
    }
    @Override
    public void dismisProgress() {
        mRlLoading.setVisibility(View.GONE);
    }

    @Override
    public void loadURlImage(List<ResultsBean> list) {
        if (mList.size()==0){
            mList.addAll(list);
        }else {
            mList.clear();
            mList.addAll(list);
        }
        adapter.notifyDataSetChanged();
    }

    @OnClick({R.id.btn_firstpage,R.id.btn_lastpage,R.id.btn_nextpage,R.id.btn_endpage})
    public void Click(View view){
        switch (view.getId()){
            case R.id.btn_firstpage:
                if (pageNow==1){
                    Toast.makeText(this,"已经是首页了",Toast.LENGTH_SHORT).show();
                    return;
                }
                pageNow = 1;
                presenter.showAndroid(20,pageNow);
                break;
            case R.id.btn_lastpage:
                if (pageNow>1){
                    pageNow = pageNow-1;
                    presenter.showAndroid(20,pageNow);
                }else{
                    Toast.makeText(this,"已经是首页了",Toast.LENGTH_SHORT).show();
                    return;
                }
                break;
            case R.id.btn_nextpage:
                pageNow = pageNow+1;
                if(pageNow>20){
                    Toast.makeText(this,"已经是最后一页了",Toast.LENGTH_SHORT).show();
                    return;
                }
                presenter.showAndroid(20,pageNow);
                Log.d("pageNow",pageNow+"");
                break;
            case R.id.btn_endpage:
                pageNow = 20;
                presenter.showAndroid(20,pageNow);
                break;
        }
    }
}
