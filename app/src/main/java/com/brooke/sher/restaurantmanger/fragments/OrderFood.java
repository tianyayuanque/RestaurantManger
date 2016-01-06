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
import com.brooke.sher.restaurantmanger.activitys.MainActivity;
import com.brooke.sher.restaurantmanger.adapters.OrderFoodAdapter;
import com.brooke.sher.restaurantmanger.beans.Bill;
import com.brooke.sher.restaurantmanger.beans.Food;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.Date;
import java.util.List;

/**
 * Created by Sher on 2016/1/4.
 * 点菜列表
 * 将
 */
public class OrderFood extends Fragment {
    private ListView listView;
    private List<Food> foodList;
    DbManager db;
    private OrderFoodAdapter orderFoodAdapter;
    private Bill bill;
    private StringBuilder allFoodNum = new StringBuilder();//设置食物数量
    private StringBuilder allFood = new StringBuilder();//设置食物名
    private int tabNum;


    private Reservation reservation;

    public StringBuilder getAllFoodNum() {
        return allFoodNum;
    }

    public StringBuilder getAllFood() {
        return allFood;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.order_food, container, false);
        setHasOptionsMenu(true);
        reservation = new Reservation();
        bill = new Bill();
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        try {
            foodList = db.findAll(Food.class);
        } catch (DbException e) {
            e.printStackTrace();
        }


        listView = (ListView) view.findViewById(R.id.lv);
        orderFoodAdapter = new OrderFoodAdapter(foodList,getActivity().getApplicationContext());
        listView.setAdapter(orderFoodAdapter);



        for (Food food:foodList){
//            if (OrderFoodAdapter.foods[i]!=0){
                allFood.append(food.getFoodName()+"/");
//            }
        }

//        for (int i=0;i<OrderFoodAdapter.foods.length;i++){
//            if (OrderFoodAdapter.foods[i]!=0){
//                allFoodNum.append(OrderFoodAdapter.foods[i]+"/");
//            }
            bill.setBillNum(new Date());
            bill.setBillFoodName(allFood.toString());
            bill.setBillFoodCount(new MainActivity().getAllFoodNum());
            bill.setBillState("未付账");
            try {
                db.update(bill);
            } catch (DbException e) {
                e.printStackTrace();
            }
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.submit,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.submit){
            //跳转到未付账单界面
            getFragmentManager().beginTransaction().replace(R.id.frame_content,new OrderAndCashier()).commit();
        }
        return true;
    }

}
