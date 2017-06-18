package com.example.administrator.metrobao.surround.util;

import android.widget.Toast;

import com.example.administrator.metrobao.surround.common.SubwayApplication;


/**
 * Toast工具类
 */
public class ToastUtil {
    /**
     * Toast信息
     *
     * @param msg 信息
     */
    public static void toast(final String msg) {
        Toast.makeText(SubwayApplication.getInstance(), msg, Toast.LENGTH_SHORT).show();
    }
}
