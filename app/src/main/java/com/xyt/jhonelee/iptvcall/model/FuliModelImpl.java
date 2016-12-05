package com.xyt.jhonelee.iptvcall.model;
import com.xyt.jhonelee.iptvcall.api.ApiService;
import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.contract.FuliContract;

import rx.Observable;

/**
* Created by JhoneLee on 2016/12/05
*/

public class FuliModelImpl implements FuliContract.Model{

    @Override
    public Observable<GankInfo> showFuli(int num, int page) {
        return ApiService.getApiservice().getFulipicture(num,page);
    }
}