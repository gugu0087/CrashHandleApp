package com.xyc.crashhandleapp;

import android.content.Context;

/**
 * Created by hasee on 2018/6/4.
 */

public class AppHolder {
    private Context context;
    private static AppHolder instance;

    public static AppHolder getInstance() {
        if (instance == null) {
            instance = new AppHolder();
        }
        return instance;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
