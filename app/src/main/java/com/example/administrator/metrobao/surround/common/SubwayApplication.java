package com.example.administrator.metrobao.surround.common;

import android.app.Application;

import com.example.administrator.metrobao.surround.util.AppUtil;
import com.example.administrator.metrobao.surround.util.SharedPreferencesUtil;
import com.tencent.bugly.crashreport.CrashReport;

import java.io.File;

/**
 * Created by lun on 2017/6/18.
 */
public class SubwayApplication extends Application {


    private static SubwayApplication instance;

    public static SubwayApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // 版本升级则拷贝数据库
        initDataBase();
        // Bugly初始化
        CrashReport.initCrashReport(getApplicationContext(), "900032862", false);
    }

    /**
     * 版本升级初始化数据库
     */
    private void initDataBase() {
        final int appVersionCode = AppUtil.getVersionCode(this);
        final int localVersionCode = SharedPreferencesUtil.getAppVersionCode();
        if (appVersionCode != localVersionCode) {
            // 版本更新，删除旧数据库
            File file = new File(AppConstants.SUBWAY_DB_FILE_PATH);
            if (file.exists()) {
                file.delete();
            }
            // 拷贝新数据库
            AppUtil.copyDBFile(this);
            // 将VersionCode写入本地SharedPreferences
            SharedPreferencesUtil.saveAppVersionCode(appVersionCode);
        }
    }
}
