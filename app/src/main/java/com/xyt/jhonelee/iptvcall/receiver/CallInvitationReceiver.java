package com.xyt.jhonelee.iptvcall.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.huawei.rcs.call.CallApi;
import com.huawei.rcs.call.CallSession;
import com.xyt.jhonelee.iptvcall.activity.call.CallIncomingActivity;

/**
 * Created by JhoneLee on 2016/11/25.
 */

public class CallInvitationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CallSession session = (CallSession) intent.getSerializableExtra(CallApi.PARAM_CALL_SESSION);

        if (session.getType() == CallSession.TYPE_VIDEO_SHARE) {
            return;
        }
        Intent newIntent = new Intent(context, CallIncomingActivity.class);
        newIntent.putExtra("sessionId", session.getSessionId());
        newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(newIntent);
    }
}
