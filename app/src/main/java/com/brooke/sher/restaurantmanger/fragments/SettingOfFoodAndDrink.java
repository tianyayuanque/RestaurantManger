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
import com.brooke.sher.restaurantmanger.adapters.FoodAndDrinkAdapter;
import com.brooke.sher.restaurantmanger.beans.Food;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

public class SettingOfFoodAndDrink extends Fragment {
private ListView lv;
    private DbManager db;
    private List<Food> foodList;
    private FoodAndDrinkAdapter foodAndDrinkAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings_of_food_and_drink, container, false);
        setHasOptionsMenu(true);
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        try {
            foodList = db.findAll(Food.class);
        } catch (DbException e) {
            e.printStackTrace();
        }
        foodAndDrinkAdapter = new FoodAndDrinkAdapter(getActivity().getApplicationContext(),foodList);
        lv = (ListView) view.findViewById(R.id.lv_analyze_of_food_drink);
        lv.setAdapter(foodAndDrinkAdapter);

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
            //跳转到添加食物界面，在哪个界面保存新的数据到数据库。
        }else if (item.getItemId()==R.id.reduce_food_and_drink){
            //弹出一个dialog，选择要删除的食物
        }


        return true;
    }
}
