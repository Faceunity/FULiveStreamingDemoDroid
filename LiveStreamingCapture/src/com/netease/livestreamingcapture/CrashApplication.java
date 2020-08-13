package com.netease.livestreamingcapture;


import android.app.Application;

import com.faceunity.nama.FURenderer;

public class CrashApplication extends Application {

    private static CrashApplication crashApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        crashApplication = this;

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
        FURenderer.setup(this);
    }

    public static CrashApplication getInstance() {
        return crashApplication;
    }
}

