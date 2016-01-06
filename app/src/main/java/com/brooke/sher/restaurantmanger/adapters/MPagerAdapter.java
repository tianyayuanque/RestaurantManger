package com.brooke.sher.restaurantmanger.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Sher on 2015/12/17.
 */
public class MPagerAdapter extends PagerAdapter{

    private List<View> mViewList;
//    private List<String> mTitleList;
//private List<String> mTitleList =new ArrayList<>();//页卡标题集合
    public MPagerAdapter(List<View> mViewList){
//        this.mTitleList = mTitleList;
        this.mViewList = mViewList;
//        mTitleList.add("今日营业");
//        mTitleList.add("接待预定");
//        mTitleList.add("点菜收银");

    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
         container.addView(mViewList.get(position));
        return mViewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    container.removeView(mViewList.get(position));
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        return mTitleList.get(position);
//    }

}
