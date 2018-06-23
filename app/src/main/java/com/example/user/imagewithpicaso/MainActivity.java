package com.example.user.imagewithpicaso;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    static ArrayList<String> imageURLS=new ArrayList<>();
    private static ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        mPager = (ViewPager) findViewById(R.id.view_pager);
        mPager.setAdapter(new ViewPagerAdapter(this,imageURLS));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        initSlider();
       }
    private void initSlider() {
        SliderInit tempObject=new SliderInit(mPager);
        tempObject.init();
    }

    private void initList() {
        imageURLS=new SliderInit().initList();
        }


}

