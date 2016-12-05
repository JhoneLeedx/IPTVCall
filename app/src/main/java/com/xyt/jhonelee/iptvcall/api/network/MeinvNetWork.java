package com.xyt.jhonelee.iptvcall.api.network;

import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.bean.Token;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by JhoneLee on 2016/12/5.
 */

public interface MeinvNetWork {

    @GET("meinv/")
    Observable<Token> getMeinv(@Query("key") String appkey, @Query("num") int num);
}
