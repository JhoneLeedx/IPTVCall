package com.xyt.jhonelee.iptvcall.activity.app;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

import com.huawei.rcs.RCSApplication;
import com.huawei.rcs.call.CallApi;
import com.huawei.rcs.call.ConferenceApi;
import com.huawei.rcs.hme.HmeAudio;
import com.huawei.rcs.hme.HmeVideo;
import com.huawei.rcs.stg.NatStgHelper;
import com.huawei.rcs.system.SysApi;
import com.huawei.rcs.tls.DefaultTlsHelper;
import com.xyt.jhonelee.iptvcall.receiver.CallInvitationReceiver;
import com.xyt.jhonelee.iptvcall.service.IPTVService;

/**
 * Created by JhoneLee on 2016/11/25.
 */

public class IPTVApplication extends RCSApplication {


    private CallInvitationReceiver receiver;
    @Override
    public void onCreate() {
        super.onCreate();

        HmeAudio.setup(this);
        HmeVideo.setup(this);
        CallApi.init(getApplicationContext());
        CallApi.setConfig(CallApi.CONFIG_MAJOR_TYPE_VIDEO_PREFER_SIZE,CallApi.CONFIG_MINOR_TYPE_DEFAULT,"2");
        //CallApi.setConfig(CallApi.CONFIG_MAJOR_TYPE_VIDEO_DISPLAY_TYPE,CallApi.CONFIG_MINOR_TYPE_DEFAULT,"0");
        SysApi.loadTls(new DefaultTlsHelper());
        SysApi.loadStg(new NatStgHelper());
        ConferenceApi.initiateApi(getApplicationContext());
        startService(new Intent(IPTVService.SERVICE_NAME));
        registReceiver();
    }
    private void registReceiver(){
        receiver = new CallInvitationReceiver();
        LocalBroadcastManager.getInstance(getApplicationContext())
                .registerReceiver(receiver, new IntentFilter(CallApi.EVENT_CALL_INVITATION));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        if (receiver!=null){
            LocalBroadcastManager.getInstance(getApplicationContext())
                    .unregisterReceiver(receiver);
        }
    }
}
