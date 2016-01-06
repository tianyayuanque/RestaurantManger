package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;

/**
 * 酒菜分析
 *从bill表中取出所有的销售记录
 * 将每样菜的菜名和数量显示在listView上
 */
public class AnalyzeOfFoodandFrink extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_analyze_of_food_drink, container, false);
    }

}
