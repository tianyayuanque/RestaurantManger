package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brooke.sher.restaurantmanger.R;

/**
 * Created by Sher on 2016/1/5.
 */
public class paySuccess extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.pay_success,container,false);
        return view;
    }

}
