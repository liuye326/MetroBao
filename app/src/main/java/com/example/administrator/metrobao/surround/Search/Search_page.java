package com.example.administrator.metrobao.surround.Search;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.Adapter.Adapter_item;
import com.example.administrator.metrobao.surround.Adapter.Route;
import com.example.administrator.metrobao.surround.MainActivity;
import com.example.administrator.metrobao.surround.map.SecondFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class search_page extends Fragment {
    @Nullable
    private Button geoButton;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.first_fragment,container,false);
        getView(v);
        setlistener();
        return v;
    }
    private void getView(View v){
        geoButton=(Button)v.findViewById(R.id.geoButton);
    }
    private void setlistener(){
        geoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), list_page.class);
                startActivity(intent);
            }
        });
    }
}
