package com.example.cheng.tabslayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * TabLayout的PagerAdapter
 *
 * @author cheng
 * @version 1.0.0
 * @since 2016-12-02
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] mTtitles;
    private ArrayList<Fragment> mFragments;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments, String[] titles) {
        super(fm);
        mFragments = fragments;
        mTtitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTtitles[position];
    }
}
