package com.example.lenovo.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Viewpageradapter extends FragmentPagerAdapter {


    private final List<Fragment> lstfragment = new ArrayList<>();
    private final List<String> lsttitles = new ArrayList<>();

    public Viewpageradapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return lstfragment.get(i);
    }

    @Override
    public int getCount() {
        return lsttitles.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitles.get(position);
    }


    public void addFragment(Fragment fragment, String title){
lstfragment.add(fragment);
lsttitles.add(title);


    }
}
