package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;

/**
 * 挂账管理
 *从bill表中取出所有的付账方式为“挂账”销售记录显示在listView上
 */
public class PayManger extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pay_manger, container, false);
    }

}
