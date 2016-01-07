package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.Bill;

import java.util.List;

/**
 * Created by Sher on 2016/1/7.
 */
public class OrderqueryAdapter extends BaseAdapter{

    private List<Bill> billList;
    private LayoutInflater inflater;

    public OrderqueryAdapter(List<Bill> billList, Context context) {
        this.billList = billList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return billList.size();
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
        ViewHolder4 viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.order_query_list, null);
            viewHolder = new ViewHolder4();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.textView3 = (TextView) convertView.findViewById(R.id.textView3);
            viewHolder.textView4 = (TextView) convertView.findViewById(R.id.textView4);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder4) convertView.getTag();
        viewHolder.textView1.setText(String.valueOf(billList.get(position).getBillNum()));
        viewHolder.textView2.setText(billList.get(position).getBillFoodName());
        viewHolder.textView3.setText(billList.get(position).getBillFoodCount());
        viewHolder.textView4.setText(String.valueOf(billList.get(position).getBillTOrRNum()));
        return convertView;
    }
}
class ViewHolder4 {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
}