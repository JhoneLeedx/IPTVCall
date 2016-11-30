package com.xyt.jhonelee.iptvcall.activity.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.xyt.jhonelee.iptvcall.model.ResultsBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class AndroidItemAdapter extends RecyclerView.Adapter<AndroidItemAdapter.AndroidViewHolder> {

    private List<ResultsBean> mList;
    private Context mContext;

    public AndroidItemAdapter(Context mContext, List<ResultsBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class AndroidViewHolder extends RecyclerView.ViewHolder{

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
