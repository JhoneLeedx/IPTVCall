package com.xyt.jhonelee.iptvcall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.xyt.jhonelee.iptvcall.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JhoneLee on 2016/12/5.
 */

public class ShowAndroidActivity extends Activity {

    @BindView(R.id.webview)
    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_android_detail);
        ButterKnife.bind(this);
        initView();
    }
    private void initView(){
        String url = getIntent().getStringExtra("url");
        view.loadUrl(url);
        view.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

        });
        //适应屏幕
        view.getSettings().setUseWideViewPort(true);
        view.getSettings().setLoadWithOverviewMode(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && view.canGoBack()) {  // goBack()表示返回WebView的上一页面
            view.goBack();
            return true;
        } else {
            //结束当前页
            return super.onKeyDown(keyCode, event);
        }
    }
}
