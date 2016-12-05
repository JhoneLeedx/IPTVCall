package com.xyt.jhonelee.iptvcall.activity.fuli;

import com.xyt.jhonelee.iptvcall.bean.GankInfo;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class FuliPresenter {

    private FuliView view;
    private FuliModel model;

    public FuliPresenter(FuliView view) {
        this.view = view;
        model = new FuliModel();
    }

    public void showFulipic(int num, int page) {

        view.showProgress();
        Observable<GankInfo> observable = model.showFuli(num, page);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GankInfo>() {
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {
                        view.dismisProgress();
                        view.showError(e.getMessage());

                    }
                    @Override
                    public void onNext(GankInfo gankInfo) {
                        view.dismisProgress();
                        if(gankInfo.isError()){
                            view.showError("访问错误。。。");
                            return;
                        }
                        view.loadURlImage(gankInfo.getResults());
                    }
                });
    }
}
