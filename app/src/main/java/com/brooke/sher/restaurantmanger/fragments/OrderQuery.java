package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;
/**
 * 点单查询
 *从bill表中取出所有付账状态为“未付账”的的销售记录显示在listView上
 *
 */
public class OrderQuery extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_query, container, false);
    }

}
