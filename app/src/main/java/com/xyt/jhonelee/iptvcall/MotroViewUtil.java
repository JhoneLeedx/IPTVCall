package com.xyt.jhonelee.iptvcall;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderHandler;
import com.xyt.jhonelee.iptvcall.widget.MetroViewBorderImpl;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class MotroViewUtil {

    public static void initView(final MetroViewBorderImpl viewBorder, ViewGroup viewGroup){
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
}
