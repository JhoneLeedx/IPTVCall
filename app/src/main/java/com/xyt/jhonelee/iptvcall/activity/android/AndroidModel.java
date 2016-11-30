package com.xyt.jhonelee.iptvcall.activity.android;

import com.xyt.jhonelee.iptvcall.api.ApiService;
import com.xyt.jhonelee.iptvcall.model.GankInfo;

import rx.Observable;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class AndroidModel {

    public Observable<GankInfo> getAndroid(int num, int page){
        Observable<GankInfo> observable = ApiService.getApiservice().getAndroid(num,page);
        return observable;
    }
}
