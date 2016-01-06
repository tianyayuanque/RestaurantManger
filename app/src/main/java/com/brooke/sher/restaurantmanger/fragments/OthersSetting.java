package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.PayMode;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

public class OthersSetting extends Fragment {
private ListView listView;
    private DbManager db;
    private List<PayMode> payModeList;//存放付款方式类的列表
    private String[] payModeNameList;//存放付款方式名的列表

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_others_setting, container, false);
        setHasOptionsMenu(true);
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);

        try {
            payModeList = db.findAll(PayMode.class);
            payModeNameList = new String[payModeList.size()];
        } catch (DbException e) {
            e.printStackTrace();
        }
        for (int i=0;i<payModeList.size();i++){
            payModeNameList[i]=payModeList.get(i).getPayModeName();
        }

        listView = (ListView) view.findViewById(R.id.others_setting);
        listView.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1,payModeNameList));


        return view;
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.plus_food_and_drink,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.plus_food_and_drink){
            //跳转到添加付账方式界面，在哪个界面保存新的数据到数据库。
        }else if (item.getItemId()==R.id.reduce_food_and_drink){
            //弹出一个dialog，选择要删除的付账方式
        }
        return true;
    }

}
