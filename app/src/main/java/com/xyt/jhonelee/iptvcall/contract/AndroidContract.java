package com.xyt.jhonelee.iptvcall.contract;

import com.xyt.jhonelee.iptvcall.bean.GankInfo;
import com.xyt.jhonelee.iptvcall.bean.ResultsBean;

import java.util.List;

import rx.Observable;

/**
 * Created by JhoneLee on 2016/12/5.
 */

public class AndroidContract {
    public interface View {
        void showError(String error);
        void showProgress();
        void dismisProgress();
        void loadURlImage(List<ResultsBean> list);
    }

    public interface Presenter {

        void showAndroid(int num,int page);
    }

    public interface Model {

        Observable<GankInfo> getAndroid(int num, int page);
    }


}