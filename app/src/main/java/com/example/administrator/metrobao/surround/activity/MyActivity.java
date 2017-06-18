package com.example.administrator.metrobao.surround.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dsunny.subway.R;


public class MyActivity extends AppCompatActivity {
    private Context context;
    private TextView typeNews,upDate,about_us,introduce;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_fragment);
        getView();

        setListener();

        //版本信息、检查更新
        typeNewsListener();
        upDateListener();
        //关于我们
        about_usListener();
    }

    public void getView() {
        typeNews = (TextView) findViewById(R.id.type_news);
        upDate = (TextView) findViewById(R.id.update);

        //关于我们、使用介绍
        about_us = (TextView)findViewById(R.id.about_us);
        introduce = (TextView)findViewById(R.id.introduce);
    }
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
    private void typeNewsListener(){
        context=this.getApplicationContext();

        typeNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"版本 V1.0.0",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void upDateListener() {
        context = this.getApplicationContext();

        upDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "已是最新版本", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void about_usListener(){
        context=this.getApplicationContext();
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.setClass(context,Aboutus.class);
                startActivity(intent1);
            }
        });
    }
}
