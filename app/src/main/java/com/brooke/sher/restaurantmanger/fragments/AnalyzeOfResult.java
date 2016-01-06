package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;
/**
 * 业绩分析
 *从bill表中取出所有的销售记录
 * 将每个服务员负责的所有账单里的菜的总售价*5%就是提成显示在listView上
 */
public class AnalyzeOfResult extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_analyze_of_result, container, false);
    }

}
