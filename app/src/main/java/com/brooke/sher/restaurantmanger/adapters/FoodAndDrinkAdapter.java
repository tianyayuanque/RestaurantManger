package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.Food;

import java.util.List;

/**
 * Created by Sher on 2016/1/6.
 */
public class FoodAndDrinkAdapter extends BaseAdapter {
    private Context context;
    private List<Food> foodList;
    private LayoutInflater inflater;
    public FoodAndDrinkAdapter(Context context ,List<Food> foodList){
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
        ViewHolder2 viewHolder2;
        if (convertView==null){
           convertView = inflater.inflate(R.layout.setting_of_food_drink_list,null);
            viewHolder2 = new ViewHolder2();
            viewHolder2.textView = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder2.textView1 = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder2.textView2 = (TextView) convertView.findViewById(R.id.textView3);
            convertView.setTag(viewHolder2);
        }
        viewHolder2 = (ViewHolder2) convertView.getTag();
        viewHolder2.textView.setText(foodList.get(position).getFoodName());
        viewHolder2.textView1.setText(foodList.get(position).getFoodType());
        viewHolder2.textView2.setText(foodList.get(position).getFoodSalePrice());



        return convertView;
    }
}
class ViewHolder2{
    TextView textView;
    TextView textView1;
    TextView textView2;

}