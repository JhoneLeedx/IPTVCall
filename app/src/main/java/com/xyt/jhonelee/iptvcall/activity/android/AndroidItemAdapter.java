package com.xyt.jhonelee.iptvcall.activity.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xyt.jhonelee.iptvcall.R;
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
    private AndroidListener listener;

    public AndroidItemAdapter(Context mContext, List<ResultsBean> mList,AndroidListener listener) {
        this.mContext = mContext;
        this.mList = mList;
        this.listener = listener;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_android,parent,false);
        AndroidViewHolder holder = new AndroidViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int position) {
            if (mList.size()==0)
                return;
        final ResultsBean bean = mList.get(position);
        holder.mTvTitle.setText(bean.getDesc());
        holder.mTvAutor.setText(bean.getWho());
        holder.mTvGithub.setText(bean.getUrl());
        if (bean.getImages()!=null){
            if (bean.getImages().size()>0){
                String url = bean.getImages().get(0);
                Glide.with(mContext).load(url).into(holder.mImage);
            }
        }
        holder.itemView.setTag(position);
        holder.itemView.setFocusable(true);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.StartAndroid(bean);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class AndroidViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.tv_title)
        protected TextView mTvTitle;
        @BindView(R.id.iv_image)
        protected ImageView mImage;
        @BindView(R.id.tv_autor)
        protected TextView mTvAutor;
        @BindView(R.id.tv_github)
        protected TextView mTvGithub;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
