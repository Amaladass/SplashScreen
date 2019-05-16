package com.example.amul.splashscreen;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

        private ViewPager viewPager;
        private LinearLayout linearLayout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        linearLayout =(LinearLayout)findViewById(R.id.dots);

    }
}
