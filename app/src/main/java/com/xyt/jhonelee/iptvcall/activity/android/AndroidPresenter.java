package com.xyt.jhonelee.iptvcall.activity.android;

import com.xyt.jhonelee.iptvcall.model.GankInfo;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.observers.Subscribers;
import rx.schedulers.Schedulers;
import rx.subjects.Subject;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public class AndroidPresenter {

    private AndroidView view;
    private AndroidModel model;
    public AndroidPresenter(AndroidView view) {
        this.view = view;
        model = new AndroidModel();
    }

    public void showAndroid(int num,int page){

        view.showProgress();
        Observable<GankInfo> observable = model.getAndroid(num,page);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<GankInfo>() {
            @Override
            public void onCompleted() {
                view.dismisProgress();
            }
            @Override
            public void onError(Throwable e) {
                view.dismisProgress();
            }
            @Override
            public void onNext(GankInfo gankInfo) {
                view.dismisProgress();
                view.loadURlImage(gankInfo.getResults());
            }
        });
    }
}
