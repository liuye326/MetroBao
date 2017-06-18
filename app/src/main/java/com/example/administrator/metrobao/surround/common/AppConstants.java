package com.example.administrator.metrobao.surround.common;
import android.os.Environment;

/**
 * Created by lun on 2017/6/18.
 */

import android.os.Environment;

/**
 * 本地常量
 */
public class AppConstants extends BaseConstants {
    public static final String SUBWAY_DB_NAME = "subway.db";
    public static final String SUBWAY_DB_FILE_PATH = Environment.getDataDirectory() + "/data/com.example.administrator.metrobao/subway.db";
    // Activity路径
    public static final String ACTIVITY_SEARCH = ".surround.activity.SearchActivity";
    public static final String ACTIVITY_DETAIL = ".surround.activity.DetailActivity";
    public static final String ACTIVITY_ABOUT_ME = ".surround.activity.AboutMeActivity";
    // Activity传值Key
    public static final String KEY_TRANSFER_DETAIL = "transferdetail";
}
