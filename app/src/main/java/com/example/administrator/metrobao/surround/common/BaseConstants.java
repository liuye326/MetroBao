package com.example.administrator.metrobao.surround.common;

import android.os.Environment;

/**
 * 常量类
 */

/**
 * Created by lun on 2017/6/18.
 */
public class BaseConstants {
    public static final String CACHE_PATH = Environment.getDataDirectory() + "/data/com.example.administrator.metrobao/cache/";
    public static final String COOKIE_CACHE_PATH = CACHE_PATH + "cookie";
    public static final String USER_CACHE_PATH = CACHE_PATH + "user";
}
