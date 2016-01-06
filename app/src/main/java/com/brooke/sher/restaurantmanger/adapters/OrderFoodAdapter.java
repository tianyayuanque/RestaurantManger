package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.activitys.MainActivity;
import com.brooke.sher.restaurantmanger.beans.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sher on 2016/1/5.
 */
public class OrderFoodAdapter extends BaseAdapter {
    private List<Food> foodList;
    private Context context;
    private LayoutInflater inflater;
    public static List<String> foods = new ArrayList<>();
    private MainActivity main = new MainActivity();
    private String allFoodNum;//可以用stringbuilder代替，效率up
    ViewHolder1 viewHolder1;





    public OrderFoodAdapter(List<Food> foodList,Context context){
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView ==null){
            convertView = inflater.inflate(R.layout.order_food_list,null);
            viewHolder1 = new ViewHolder1();
            viewHolder1.textView = (TextView) convertView.findViewById(R.id.textViewOrderFoodList);
            viewHolder1.editText = (EditText) convertView.findViewById(R.id.editText1);
            convertView.setTag(viewHolder1);
        }

            viewHolder1 = (ViewHolder1) convertView.getTag();
            Food food = foodList.get(position);
            viewHolder1.textView.setText(food.getFoodName());
            viewHolder1.editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (viewHolder1.editText.getText().toString()=="0"){
                        allFoodNum+="0/";
                    }
                    allFoodNum+=s.toString()+"/";
                    main.setAllFoodNum(allFoodNum);
                }
            });


        return convertView;
    }
}
class ViewHolder1{
    TextView textView;
    EditText editText;
}