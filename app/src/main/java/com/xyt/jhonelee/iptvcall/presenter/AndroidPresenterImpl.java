package com.xyt.jhonelee.iptvcall.presenter;
import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.contract.AndroidContract;
import com.xyt.jhonelee.iptvcall.model.AndroidModelImpl;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by JhoneLee on 2016/12/05
*/

public class AndroidPresenterImpl implements AndroidContract.Presenter{


    private AndroidContract.Model model;
    private AndroidContract.View view;

    public AndroidPresenterImpl(AndroidContract.View view) {
        this.view = view;
        model = new AndroidModelImpl();
    }

    @Override
    public void showAndroid(int num, int page) {
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
                view.showError(e.getMessage());
            }
            @Override
            public void onNext(GankInfo gankInfo) {
                view.dismisProgress();
                if (gankInfo.isError()){
                    view.showError("访问错误");
                    return;
                }
                view.loadURlImage(gankInfo.getResults());
            }
        });
    }
}