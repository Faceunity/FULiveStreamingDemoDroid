package com.netease.livestreamingcapture;


import android.app.Application;

import com.faceunity.FUConfig;
import com.faceunity.nama.FURenderer;
import com.faceunity.nama.utils.FuDeviceUtils;

public class CrashApplication extends Application {

    private static CrashApplication crashApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        crashApplication = this;

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());

        FUConfig.DEVICE_LEVEL = FuDeviceUtils.judgeDeviceLevel(this);
        FURenderer.getInstance().setup(this);
    }

    public static CrashApplication getInstance() {
        return crashApplication;
    }
}

