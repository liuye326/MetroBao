package com.example.administrator.metrobao.surround.Settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.metrobao.R;

/**
 * Created by Administrator on 2017/6/7.
 */
public class About_us extends AppCompatActivity {

    private ImageView back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
        geView();
        setlistener();
    }

    public void geView(){
        back=(ImageView)findViewById(R.id.g_return);
    }

    public void setlistener() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.putExtra("radio_masg",2);
                startActivity(i);
            }
        });
    }
}
