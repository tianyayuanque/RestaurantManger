package com.brooke.sher.restaurantmanger.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Sher on 2015/12/17.
 */
public class MFragmentPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> mViewList;
    private List<String> mTitleList;

public MFragmentPagerAdapter(FragmentManager fm,List<Fragment> mViewList,List<String> mTitleList) {
    super(fm);
    this.mTitleList = mTitleList;
    this.mViewList = mViewList;
}

    @Override
    public Fragment getItem(int position) {
        return mViewList.get(position);
    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
