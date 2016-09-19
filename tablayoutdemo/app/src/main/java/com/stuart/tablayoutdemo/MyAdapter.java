package com.stuart.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.stuart.tablayoutdemo.fragment.Fragment1;
import com.stuart.tablayoutdemo.fragment.Fragment2;
import com.stuart.tablayoutdemo.fragment.Fragment3;


/**
 * Created by Stuart on 2016/9/19.
 */
public class MyAdapter extends FragmentStatePagerAdapter {


    private String[] mTitles = new String[]{"首页", "发现", "生活"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    //ViewPager与TabLayout 绑定之后，获取到PageTitle就是tab的text
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
