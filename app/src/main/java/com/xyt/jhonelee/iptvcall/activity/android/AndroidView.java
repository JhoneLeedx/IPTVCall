package com.xyt.jhonelee.iptvcall.activity.android;

import com.xyt.jhonelee.iptvcall.model.ResultsBean;

import java.util.List;

/**
 * Created by JhoneLee on 2016/11/30.
 */

public interface AndroidView {

    void showProgress();
    void dismisProgress();
    void loadURlImage(List<ResultsBean> list);
}
