package com.xyt.jhonelee.iptvcall.model;
import com.xyt.jhonelee.iptvcall.api.ApiService;
import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.contract.AndroidContract;

import rx.Observable;

/**
* Created by JhoneLee on 2016/12/05
*/

public class AndroidModelImpl implements AndroidContract.Model{

    @Override
    public Observable<GankInfo> getAndroid(int num, int page) {
        Observable<GankInfo> observable = ApiService.getApiservice().getAndroid(num,page);
        return observable;
    }
}