package com.example.administrator.metrobao.surround.Search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.metrobao.R;

/**
 * Created by Administrator on 2017/5/25.
 */
public class Mainpage extends Activity {
    private ImageView back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        getView();
        onClick();
    }
    private void getView(){
        back=(ImageView)findViewById(R.id.img);
    }
    private void onClick(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainpage.this,list_page.class);
                startActivity(intent);
            }
        });
    }
}
