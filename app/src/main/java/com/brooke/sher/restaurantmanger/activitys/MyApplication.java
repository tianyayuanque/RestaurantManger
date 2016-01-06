package com.brooke.sher.restaurantmanger.activitys;

import android.app.Application;
import org.xutils.x;
/**
 * Created by Sher on 2016/1/4.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
