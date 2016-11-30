package com.xyt.jhonelee.iptvcall.api.network;

import com.xyt.jhonelee.iptvcall.model.GankInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public interface FuliNetwork {

    @GET("福利/{num}/{page}")
    Observable<GankInfo> showFulipicture(@Path("num")int num,@Path("page")int page);

    @GET("Android/{num}/{page}")
    Observable<GankInfo> showAndroid(@Path("num")int num,@Path("page")int page);
}
