package com.xyt.jhonelee.iptvcall.activity.call;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xyt.jhonelee.iptvcall.MotroViewUtil;
import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.activity.fuli.FuliActivity;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by JhoneLee on 2016/11/25.
 */

public class CallIncomingActivity extends Activity {
    @BindView(R.id.relativelayout)
    RelativeLayout layout;
    @BindView(R.id.linearlayout)
    LinearLayout linearLayout;

    @BindView(R.id.textView)
    TextView textView;
    private MetroViewBorderImpl viewBorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callincoming);
        ButterKnife.bind(this);

        viewBorder = new MetroViewBorderImpl(this);
        MotroViewUtil.initView(viewBorder,linearLayout);
        MotroViewUtil.initView(viewBorder,layout);
    }
    @OnClick({R.id.btn_video,R.id.btn_voice})
    public void Onclick(View view){
        switch (view.getId()){
            case R.id.btn_video:
                showDialog();
                Toast.makeText(this,"btn_video",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_voice:
                Toast.makeText(this,"btn_voice",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, FuliActivity.class));
                break;
        }
    }
    private void showDialog(){
        MetroViewBorderImpl viewBorder = new MetroViewBorderImpl(this);
        View contentView = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        PopupWindow popWnd =new  PopupWindow(this);
        popWnd.setContentView(contentView);
        popWnd.setFocusable(true);
        MotroViewUtil.initView(viewBorder,(RelativeLayout)contentView.findViewById(R.id.activity_main));
        popWnd.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        popWnd.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        popWnd.showAsDropDown(textView,Gravity.BOTTOM,0,0);
    }
}
