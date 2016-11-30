package com.xyt.jhonelee.iptvcall.activity.fuli;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.model.ResultsBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {




    // 数据集
    private List<ResultsBean> mList;
    private Context mContext;
    private ImageListener listener;

    public ItemAdapter(List<ResultsBean> mList, Context mContext,ImageListener listener) {
        this.mList = mList;
        this.mContext = mContext;
        this.listener = listener;
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int resId = R.layout.item_fuli;
        View view = LayoutInflater.from(mContext).inflate(resId, parent, false);
        ItemViewHolder holder = new ItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

        if (mList.size() == 0)
            return;
        final ResultsBean bean = mList.get(position);
        holder.tvTitle.setText(bean.getWho());
        holder.tvDesc.setText(bean.getDesc());
        Glide.with(mContext).load(bean.getUrl()).into(holder.ivImage);
        holder.itemView.setTag(position);
        holder.itemView.setFocusable(true);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.showImage(bean.getUrl());
            }
        });
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }
    class ItemViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_image)
        protected ImageView ivImage;
        @BindView(R.id.tv_title)
        protected TextView tvTitle;
        @BindView(R.id.tv_desc)
        protected TextView tvDesc;
        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }
}
