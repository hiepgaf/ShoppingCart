package com.ecommerceapp;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by Sagar Shedge on 29/11/16.
 */

public class EcommerceApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
