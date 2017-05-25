package com.example.administrator.metrobao.surround.Search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.map.SecondFragment;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class Search_page extends Fragment {
    @Nullable
    private Button geoButton;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.sec_fragment,container,false);
        getView(v);
        return v;
    }
    private void getView(View v){
        geoButton=(Button)v.findViewById(R.id.geoButton);
    }
    private void setlistener(){
        geoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(Search_page.this,SecondFragment.class);
                startActivity(i);
            }
        });
    }
}