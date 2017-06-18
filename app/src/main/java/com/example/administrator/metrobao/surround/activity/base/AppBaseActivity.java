package com.example.administrator.metrobao.surround.activity.base;

import android.content.Intent;
import android.view.MenuItem;

import com.umeng.analytics.MobclickAgent;

/**
 * 封装业务相关的公用逻辑
 */
public abstract class AppBaseActivity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
    /**
     * 设置ActionBar标题
     *
     * @param title 标题名称
     */
    protected void setActionBarTitle(String title) {
        mActionBar.setTitle(title == null ? "" : title);
    }


    /**
     * 启动Activity
     *
     * @param activity 当前Activity
     * @param intent   请求Intent
     */
    protected void startAppActivity(String activity, Intent intent) {
        try {
            Class activityClass = Class.forName(activity);
            if (intent == null) {
                startActivity(new Intent(mContext, activityClass));
            } else {
                intent.setClass(mContext, activityClass);
                startActivity(intent);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
