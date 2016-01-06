package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.adapters.TableOrRoomAdapter;
import com.brooke.sher.restaurantmanger.beans.Bill;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

/**
 * 接待预订
 * 将选择的桌子的号码保存
 */
public class Reservation extends Fragment {

    private ListView listView;
    private DbManager db;
    private List<TableORRoom> tOrList;
    private int tabNum;
    private Bill bill;
    private TableOrRoomAdapter tableOrRoomAdapter;

    public int getTabNum() {
        return tabNum;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reservation, container, false);
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        bill = new Bill();
        try {
            tOrList = db.findAll(TableORRoom.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        tableOrRoomAdapter = new TableOrRoomAdapter(tOrList, getActivity().getApplicationContext());
        listView = (ListView) view.findViewById(R.id.lv_reservation);
        listView.setAdapter(tableOrRoomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (tOrList.get(position).gettOrRState() == "正用") {
                    Toast.makeText(getActivity().getApplicationContext(), "此房台已被使用", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        bill.setBillTOrRNum(position);
                        tOrList.get(position).settOrRState("正用");
                        db.save(bill);
                        db.update(tOrList.get(position));
                        tabNum = tOrList.get(position).gettOrRNum();//将此时点击的桌子号码保存
                        //跳转到点菜页面
                        getFragmentManager().beginTransaction().replace(R.id.frame_content, new OrderFood()).commit();
                    } catch (DbException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view;
    }
}
