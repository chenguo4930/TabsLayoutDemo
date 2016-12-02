package com.example.cheng.tabslayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private String[] mTitle = {"课程视频","视频下载"};
    private MyFragmentPagerAdapter mFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(MyFragment.newInstance(0));
        fragments.add(MyFragment.newInstance(1));
        mFragmentAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),fragments,mTitle);
        mViewPager.setAdapter(mFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
