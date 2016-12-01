package com.xyt.jhonelee.iptvcall;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by JhoneLee on 2016/12/1.
 */

public class DpiUtil {

    public static boolean getTVOrPhone(Activity activity){
    DisplayMetrics metric = new DisplayMetrics();activity.getWindowManager().getDefaultDisplay().getMetrics(metric);
    int width = metric.widthPixels;  // 屏幕宽度（像素）
    int height = metric.heightPixels;  // 屏幕高度（像素）
    float density = metric.density;  // 屏幕密度（0.75 / 1.0 / 1.5）
    int densityDpi = metric.densityDpi;
        if (width>height){
            return false;
        }else {
            return true;
        }
    }
}
