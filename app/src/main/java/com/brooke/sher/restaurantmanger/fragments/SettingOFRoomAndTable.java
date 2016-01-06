package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.adapters.TableOrRoomAdapter;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

/**
 * Created by Sher on 2016/1/6.
 */
public class SettingOFRoomAndTable extends Fragment {
private ListView lv;
    private DbManager db;
    private List<TableORRoom> tableORRoomList;
    private TableOrRoomAdapter tableOrRoomAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting_of_room_and_table,container,false);
        setHasOptionsMenu(true);
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        try {
            tableORRoomList = db.findAll(TableORRoom.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        lv = (ListView) view.findViewById(R.id.settings_of_room_and_table);
        tableOrRoomAdapter = new TableOrRoomAdapter(tableORRoomList,getActivity().getApplicationContext());
        lv.setAdapter(tableOrRoomAdapter);
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
            //跳转到添加房台界面，在哪个界面保存新的数据到数据库。
        }else if (item.getItemId()==R.id.reduce_food_and_drink){
            //弹出一个dialog，选择要删除的房台
        }
        return true;
    }
}
