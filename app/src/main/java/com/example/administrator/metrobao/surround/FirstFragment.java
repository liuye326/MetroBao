package com.example.administrator.metrobao.surround;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.metrobao.R;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class FirstFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate(R.layout.first_fragment, null);
        return container;
    }
}