package com.example.administrator.metrobao.surround;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.administrator.metrobao.R;
import com.example.administrator.metrobao.surround.Search.Search_page;
import com.example.administrator.metrobao.surround.Settings.ThirdFragment;
import com.example.administrator.metrobao.surround.map.SecondFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private FragmentManager fragment;
    private RadioGroup radioGroup;
    private FragmentTransaction fragmentTransaction;
    private Search_page search_page;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;
    private ViewPager viewpager;
    MyAdpter myAdpter;
    private List<Fragment> list;
    private Context context;
    private TextView typeNews,upDate,about_us,introduce;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取管理工具
        fragment = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        //版本信息、检查更新
        typeNews = (TextView)findViewById(R.id.type_news);
        upDate = (TextView)findViewById(R.id.update);
        //实例化fragment
        search_page = new Search_page();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        list = new ArrayList<>();
        list.add(search_page);
        list.add(secondFragment);
        list.add(thirdFragment);
        myAdpter = new MyAdpter(fragment);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //开启事务
//                fragmentTransaction = fragment.beginTransaction();
                switch (checkedId) {
                    case R.id.radio_masg:
                        //替换填充view
//                        fragmentTransaction.replace(R.id.viewpager, search_page);
                        viewpager.setCurrentItem(0);
                        break;
                    case R.id.radio_imag:
                        viewpager.setCurrentItem(1);
//                        fragmentTransaction.replace(R.id.viewpager, secondFragment);
                        break;
                    case R.id.radio_setting:
                        viewpager.setCurrentItem(2);
//                        fragmentTransaction.replace(R.id.viewpager, thirdFragment);
                        break;
                }
                //提交数据
//                fragmentTransaction.commit();
            }
        });
        viewpager.setAdapter(myAdpter);
        viewpager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                radioGroup.check(R.id.radio_masg);
                break;
            case 1:
                radioGroup.check(R.id.radio_imag);
                break;
            case 2:
                radioGroup.check(R.id.radio_setting);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public class MyAdpter extends FragmentPagerAdapter {


        public MyAdpter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }

    @Override
    protected void onResume() {
        int id_1= getIntent().getIntExtra("radio_masg", 0);
        int id_2= getIntent().getIntExtra("radio_imag", 1);
        int id_3 = getIntent().getIntExtra("radio_setting", 2);
        if(id_1==0) {
            onPageSelected(0);
        }
        if(id_2==1) {
            onPageSelected(1);
        }
        if(id_3==2) {
            onPageSelected(2);
        }
        super.onResume();
    }
}