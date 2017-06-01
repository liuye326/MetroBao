package com.example.administrator.metrobao.surround.Search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.MainActivity;

/**
 * Created by Administrator on 2017/5/25.
 */
public class list_page extends Activity {
    private ListView lv;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);

        getView();
        onClick();
    }
    private void getView(){
        lv=(ListView)findViewById(R.id.MylistView);
        back=(ImageView)findViewById(R.id.imageView);

    }
    private void onClick(){
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent();
                intent.setClass(list_page.this,Mainpage.class);
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
}
