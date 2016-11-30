package com.xyt.jhonelee.iptvcall.activity.fuli;

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

import com.xyt.jhonelee.iptvcall.MotroViewUtil;
import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.activity.ShowImageActivity;
import com.xyt.jhonelee.iptvcall.model.ResultsBean;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class FuliActivity extends Activity implements FuliView,ImageListener{

    @BindView(R.id.linearlayout)
    LinearLayout mLinear;
    @BindView(R.id.recycler)
    RecyclerView mRecycler;
    @BindView(R.id.rl_loading)
    protected RelativeLayout mRlLoading;

    private MetroViewBorderImpl mMetro;
    private List<ResultsBean> mList;
    private ItemAdapter adapter;
    private FuliPresenter presenter;

    private int pageNow=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuli);
        ButterKnife.bind(this);
        mMetro = new MetroViewBorderImpl(this);
        mMetro.setBackgroundResource(R.drawable.border_color);
        presenter = new FuliPresenter(this);
        presenter.showFulipic(20,1);
        initRecyclerView();
    }


    public void initRecyclerView(){
        mList = new ArrayList<>();
        GridLayoutManager manager = new GridLayoutManager(this,5);
        mRecycler.setLayoutManager(manager);
        mRecycler.setFocusable(false);
        mMetro.attachTo(mRecycler);
        adapter = new ItemAdapter(mList,this,this);
        mRecycler.setAdapter(adapter);
        MotroViewUtil.initView(mMetro,mLinear);
        //MotroViewUtil.initView(mMetro,mRefresh);
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
        if(mList.size()==0){
            mList.addAll(list);
        }else{
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
                presenter.showFulipic(20,pageNow);
                break;
            case R.id.btn_lastpage:
                if (pageNow>1){
                    pageNow = pageNow-1;
                    presenter.showFulipic(20,pageNow);
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
                presenter.showFulipic(20,pageNow);
                Log.d("pageNow",pageNow+"");
                break;
            case R.id.btn_endpage:
                pageNow = 20;
                presenter.showFulipic(20,pageNow);
                break;
        }
    }

    @Override
    public void showImage(String url) {
        Intent intent = new Intent();
        intent.putExtra("url",url);
        intent.setClass(this, ShowImageActivity.class);
        startActivity(intent);
    }
}
