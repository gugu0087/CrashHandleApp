package com.xyc.crashhandleapp;

import android.app.Application;

import com.xyc.crashhandle.CrashManager;


/**
 * Created by hasee on 2018/6/4.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashManager.getInstance().init(this);
        AppHolder.getInstance().setContext(this);
    }
}
