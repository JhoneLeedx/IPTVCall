package com.xyt.jhonelee.iptvcall.service;

import android.content.Intent;

import com.huawei.rcs.RCSService;

/**
 * Created by JhoneLee on 2016/11/25.
 */

public class IPTVService extends RCSService {

    public final static String SERVICE_NAME = "com.xyt.jhonelee.iptvcall.iptvservice";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
