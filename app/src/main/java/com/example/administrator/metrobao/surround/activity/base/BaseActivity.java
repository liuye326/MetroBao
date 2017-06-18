package com.example.administrator.metrobao.surround.activity.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 封装业务无关的公用逻辑
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected ActionBar mActionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = BaseActivity.this;
        mActionBar = getSupportActionBar();

        initVariables();
        initViews(savedInstanceState);
        loadData();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    /**
     * 初始化变量
     */
    protected abstract void initVariables();

    /**
     * 初始化页面View
     *
     * @param savedInstanceState Activity保存的状态
     */
    protected abstract void initViews(Bundle savedInstanceState);

    /**
     * 获取页面显示数据
     */
    protected abstract void loadData();

    /**
     * 查找布局中的视图
     *
     * @param id  布局文件中的视图ID
     * @param <T> 视图类
     * @return 视图View
     */
    public <T extends View> T findAppViewById(int id) {
        return (T) super.findViewById(id);
    }

    /**
     * 查找指定视图中的视图
     *
     * @param view 指定的视图
     * @param id   视图中的视图ID
     * @param <T>  视图类
     * @return 视图View
     */
    public <T extends View> T findAppViewById(View view, int id) {
        return (T) view.findViewById(id);
    }

}
