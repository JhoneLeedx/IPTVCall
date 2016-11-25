package com.xyt.jhonelee.iptvcall.call;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.xyt.jhonelee.iptvcall.R;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderHandler;
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
    private MetroViewBorderImpl viewBorder;
    private MetroViewBorderImpl viewBorder1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callincoming);
        ButterKnife.bind(this);
        viewBorder = new MetroViewBorderImpl(this);
        viewBorder1 = new MetroViewBorderImpl(this);
        initView(viewBorder,layout);
        initView(viewBorder1,linearLayout);
    }
    private void initView(final MetroViewBorderImpl viewBorder, ViewGroup viewGroup){
        viewBorder.attachTo(viewGroup);
        viewBorder.setBackgroundResource(R.drawable.border_color);
        viewBorder.getViewBorder().addOnFocusChanged(new MetroViewBorderHandler.FocusListener() {
            @Override
            public void onFocusChanged(View oldFocus, View newFocus) {
                viewBorder.getView().setTag(newFocus);
            }
        });
        viewBorder.getViewBorder().addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                View t = viewBorder.getView().findViewWithTag("top");
                if (t != null) {
                    ((ViewGroup) t.getParent()).removeView(t);
                    View of = (View) viewBorder.getView().getTag(viewBorder.getView().getId());
                    ((ViewGroup) of).addView(t);
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                View nf = (View) viewBorder.getView().getTag();
                if (nf != null) {
                    View top = nf.findViewWithTag("top");
                    if (top != null) {
                        ((ViewGroup) top.getParent()).removeView(top);
                        ((ViewGroup) viewBorder.getView()).addView(top);
                        viewBorder.getView().setTag(viewBorder.getView().getId(), nf);
                    }
                }
            }
            @Override
            public void onAnimationCancel(Animator animator) {

            }
            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }
    @OnClick({R.id.btn_video,R.id.btn_voice})
    public void Onclick(View view){
        switch (view.getId()){
            case R.id.btn_video:
                Toast.makeText(this,"btn_video",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_voice:
                Toast.makeText(this,"btn_voice",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
