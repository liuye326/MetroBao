package com.example.administrator.metrobao.surround.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.metrobao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
public class Adapter_item extends BaseAdapter{
    private List<Route> list=new ArrayList<>();
    private Context context;
    public Adapter_item(List<Route> list,Context context) {
        this.context=context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Route getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view=LayoutInflater.from(context).inflate(R.layout.item_1,null);
        Route route=getItem(position);;
        TextView tv= (TextView) view.findViewById(R.id.tv);
        tv.setText(route.getRoute());
        return view;
    }
}
