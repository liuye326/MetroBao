package com.example.administrator.metrobao.surround.Settings;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.metrobao.R;

/**
 * Created by 李烨 on 2017/6/2 0017.
 */

public class ThirdFragment extends Fragment {
    private FragmentManager fm;
    private Context context;
    private TextView typeNews,upDate,about_us,introduce;
    private ImageView imgView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);

        //获取点击对象
        //版本信息、检查更新
        typeNews = (TextView)view.findViewById(R.id.type_news);
        upDate = (TextView)view.findViewById(R.id.update);

        //关于我们、使用介绍
        about_us = (TextView)view.findViewById(R.id.about_us);
        introduce = (TextView)view.findViewById(R.id.introduce);

        setListener();

        //版本信息、检查更新
        typeNewsListener();
        upDateListener();
        //关于我们
        about_usListener();


        return view;

    }
    /*作者：李越
    *页面选项触摸变色，不触摸恢复原装
    * 2016.12.8
    * */
    private void setListener() {
        typeNews.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN://触摸，按下
                        typeNews.setBackgroundColor(Color.parseColor("#009FCC"));
                        break;
                    case MotionEvent.ACTION_UP://拿开
                        typeNews.setBackgroundResource(R.drawable.beijing12);
                        break;
                }
                return false;
            }
        });
        upDate.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        upDate.setBackgroundColor(Color.parseColor("#009FCC"));
                        break;
                    case MotionEvent.ACTION_UP:
                        upDate.setBackgroundResource(R.drawable.beijing12);
                        break;
                }
                return false;
            }
        });
        about_us.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        about_us.setBackgroundColor(Color.parseColor("#009FCC"));
                        break;
                    case MotionEvent.ACTION_UP:
                        about_us.setBackgroundResource(R.drawable.beijing12);
                        break;
                }
                return false;
            }
        });
        introduce.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        introduce.setBackgroundColor(Color.parseColor("#009FCC"));
                        break;
                    case MotionEvent.ACTION_UP:
                        introduce.setBackgroundResource(R.drawable.beijing12);
                        break;
                }
                return false;
            }
        });
    }

    /**
     * 给版本信息添加点击事件
     * 作者：李烨
     * 时间：2016/12/6
     */

    private void typeNewsListener(){
        context=getActivity().getApplicationContext();

        typeNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"版本 V1.0.0",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 给检查更新添加点击事件
     * 作者：李烨
     * 时间：2016/12/6
     */
    private void upDateListener(){
        context=getActivity().getApplicationContext();

        upDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"已是最新版本",Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 给关于我们添加点击事件及跳转
     * 作者：李烨
     * 时间：2016/12/6
     */
    private void about_usListener(){
        context=getActivity().getApplicationContext();
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.setClass(context,Aboutus.class);
                startActivity(intent1);
            }
        });
    }
    /**
     * 给使用介绍添加点击事件及跳转
     * 作者：李烨
     * 时间：2016/12/6
     */
   /* private void introduceListener(){
        context=getActivity().getApplicationContext();
        introduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.setClass(context,Introduce.class);
                startActivity(intent2);
            }
        });
    }*/
}