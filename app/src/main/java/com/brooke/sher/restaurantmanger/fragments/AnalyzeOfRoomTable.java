package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;
/**
 * 房台分析
 *从bill表中取出所有的销售记录
 * 将每张桌子或房间的号码和使用次数显示在listView上
 */
public class AnalyzeOfRoomTable extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_analyze_of_room_table, container, false);
    }

}
