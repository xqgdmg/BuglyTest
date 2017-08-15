package com.example.qhsj.buglytest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by qhsj on 2017/8/15.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "f5622b6a1a", false);
    }
}
