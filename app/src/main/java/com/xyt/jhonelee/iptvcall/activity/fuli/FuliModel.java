package com.xyt.jhonelee.iptvcall.activity.fuli;

import com.xyt.jhonelee.iptvcall.api.ApiService;
import com.xyt.jhonelee.iptvcall.bean.GankInfo;

import rx.Observable;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class FuliModel {

    public Observable<GankInfo> showFuli(int num,int page){
        return ApiService.getApiservice().getFulipicture(num,page);
    }
}
