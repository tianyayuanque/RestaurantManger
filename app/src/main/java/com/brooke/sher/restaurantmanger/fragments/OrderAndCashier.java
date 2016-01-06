package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.activitys.MainActivity;
import com.brooke.sher.restaurantmanger.adapters.TableOrRoomAdapter;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

/**
 * 跳转的时候将点击的列表选项的桌子的号码传给下一个页面即付账页面
 */
public class OrderAndCashier extends Fragment {
    private ListView listView;
    private List<TableORRoom> tOrList;
    private DbManager db;
    private TableOrRoomAdapter tableOrRoomAdapter;
    private MainActivity main;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_and_cashier, container, false);
        main = new MainActivity();
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        try {

            //查询已使用的房间
            tOrList = db.selector(TableORRoom.class).where("tOrRState", "=", "正用").findAll();
        } catch (DbException e) {
            e.printStackTrace();
        }
        listView = (ListView) view.findViewById(R.id.lv);
        tableOrRoomAdapter = new TableOrRoomAdapter(tOrList, getActivity().getApplicationContext());
        listView.setAdapter(tableOrRoomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main.setTabNum(tOrList.get(position).gettOrRNum());
                tOrList.get(position).settOrRState("未用");

                try {
                    db.update(tOrList.get(position));
                } catch (DbException e) {
                    e.printStackTrace();
                }
                getFragmentManager().beginTransaction().replace(R.id.frame_content, new BillPay()).commit();
            }
        });
        return view;
    }

}
