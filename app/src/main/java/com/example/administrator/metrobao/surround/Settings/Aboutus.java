package com.example.administrator.metrobao.surround.Settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.MainActivity;

/**
 * Created by Administrator on 2017/6/7.
 */
public class Aboutus extends Activity{

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
                i.setClass(Aboutus.this, MainActivity.class);
                i.putExtra("radio_setting",2);
                startActivity(i);
            }
        });
    }
}
