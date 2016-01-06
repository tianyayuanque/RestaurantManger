package com.brooke.sher.restaurantmanger.db;

import org.xutils.DbManager;

/**
 * Created by Sher on 2016/1/4.
 */
public class DBHelper {

    public static final DbManager.DaoConfig dbOperation() {
        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
                .setDbName("restaurant")
//                .setDbDir(new File("/sdcard"))
                .setDbVersion(1)
                .setAllowTransaction(true)
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
                        // TODO: ...
                        // db.addColumn(...);
                        // db.dropTable(...);
                        // ...
                    }
                });
        return daoConfig;
}
}
