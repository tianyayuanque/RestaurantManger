package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.Bill;
import com.brooke.sher.restaurantmanger.beans.Food;

import java.util.List;

/**
 * Created by Sher on 2016/1/7.
 */
public class AnalyzeOfFoodandFrinkAdapter extends BaseAdapter {

    private List<Bill> billList;
    private List<Food> foodList;
    private LayoutInflater inflater;
    public AnalyzeOfFoodandFrinkAdapter( List<Bill> billList,List<Food> foodList, Context context) {
        this.billList = billList;
        this.foodList = foodList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder8 viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.analyze_of_food_drink_list, null);
            viewHolder = new ViewHolder8();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder8) convertView.getTag();
        viewHolder.textView1.setText(foodList.get(position).getFoodName());
        viewHolder.textView2.setText(String.valueOf(billList.size()));
        return convertView;
    }
}
