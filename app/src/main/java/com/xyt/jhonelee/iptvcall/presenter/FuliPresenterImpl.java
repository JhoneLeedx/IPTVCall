package com.xyt.jhonelee.iptvcall.presenter;

import android.content.Context;

import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.contract.FuliContract;
import com.xyt.jhonelee.iptvcall.model.FuliModelImpl;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by JhoneLee on 2016/12/05
 */

public class FuliPresenterImpl implements FuliContract.Presenter {

    private FuliContract.View view;
    private FuliContract.Model model;


    public FuliPresenterImpl(FuliContract.View view) {
        this.view = view;
        model = new FuliModelImpl();
    }

    @Override
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
                        if (gankInfo.isError()) {
                            view.showError("访问错误。。。");
                            return;
                        }
                        view.loadURlImage(gankInfo.getResults());
                    }
                });
    }
}