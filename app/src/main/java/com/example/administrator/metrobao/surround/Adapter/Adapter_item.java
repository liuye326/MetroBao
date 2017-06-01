package com.example.administrator.metrobao.surround.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.metrobao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
public class Adapter_item extends BaseAdapter{
    private ArrayList<Route> route=new ArrayList<>();
    private Context context;
    public Adapter_item(ArrayList<Route> route,Context context) {
        this.context=context;
        this.route=route;
    }

    @Override
    public int getCount() {
        return route.size();
    }

    @Override
    public Route getItem(int position) {
        return route.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //加载布局为一个视图
       view=LayoutInflater.from(context).inflate(R.layout.item_1,null);
        TextView tv= (TextView) view.findViewById(R.id.tv);
        tv.setText(route.get(i).getRoute());
        ImageView img=(ImageView) view.findViewById(R.id.img);
        img.setImageResource(route.get(i).getImg());
        return view;
    }
}
