package com.example.administrator.metrobao.surround.Search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.Adapter.Adapter_item;
import com.example.administrator.metrobao.surround.Adapter.Route;
import com.example.administrator.metrobao.surround.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
public class list_page extends Activity {
    private ListView lv;
    private ImageView back;
    private ArrayList<Route> route=new ArrayList<Route>();
    private Adapter_item myadapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);
        getView();
        getData();
        setAdapter();
        onClick();
    }

    public void setAdapter(){
        myadapter = new Adapter_item(route,this);
        lv.setAdapter(myadapter);
    }

    private void getView(){
        lv = (ListView)findViewById(R.id.MylistView);
        back=(ImageView)findViewById(R.id.imageView);
    }

    public void onClick(){
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(list_page.this,Mainpage.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(list_page.this, MainActivity.class);
                intent.putExtra("radio_masg",0);
                startActivity(intent);
            }
        });
    }
    private void getData() {//数据样例
        route.add(new Route("站点A>站点B",R.drawable.bussearch_go));
        route.add(new Route("站点A>站点B",R.drawable.bussearch_go));
        route.add(new Route("站点A>站点B",R.drawable.bussearch_go));
        route.add(new Route("站点A>站点B",R.drawable.bussearch_go));
        route.add(new Route("站点A>站点B",R.drawable.bussearch_go));
    }
}