package com.xyt.jhonelee.iptvcall.activity.fuli;

import com.xyt.jhonelee.iptvcall.model.ResultsBean;

import java.util.List;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public interface FuliView {

    void showProgress();
    void dismisProgress();
    void loadURlImage(List<ResultsBean> list);
}
