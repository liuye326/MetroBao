package com.example.administrator.metrobao.surround.Adapter;

import android.widget.ImageView;

/**
 * Created by Administrator on 2017/5/25.
 */
public class Route {//item类
    private String route;//路线
    private int img;

    public Route(String route,int img){
        this.route=route;
        this.img=img;
    }
    public String getRoute(){
        return  route;}

    public void setRoute(String route){

        this.route=route;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
