package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;
/**
 * 销售分析
 *从bill表中取出所有的销售记录
 * 将每样菜的数量、价格和成本取出得出总的售价和总的支出显示在textVie上
 */
public class AnalyzeOfsales extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_analyze_of_sales, container, false);










        return view;
    }

}
