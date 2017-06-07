package com.example.administrator.metrobao.surround.Settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.metrobao.R;

/**
 * Created by 李烨 on 2017/6/2 0017.
 */

public class ThirdFragment extends Fragment {
    private View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = (ViewGroup) inflater.inflate(R.layout.third_fragment, null);
        getView(v);
        setlistener();

        return v;
    }
    private TextView about_us,type_news,update,introduce;

    public void getView(View v){
        about_us=(TextView) v.findViewById(R.id.about_us);
        type_news=(TextView)v.findViewById(R.id.type_news);
        update=(TextView)v.findViewById(R.id.update);
        introduce=(TextView)v.findViewById(R.id.introduce);
    }
    public  void setlistener(){
        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(getActivity(),About_us.class);
                startActivity(i);
            }
        });
        /*
        type_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        introduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }
}