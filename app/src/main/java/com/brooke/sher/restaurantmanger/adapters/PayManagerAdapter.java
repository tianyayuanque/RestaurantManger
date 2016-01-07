package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.Customer;

import java.util.List;

/**
 * Created by Sher on 2016/1/7.
 */
public class PayManagerAdapter extends BaseAdapter {
    private List<Customer> customerList;
    private LayoutInflater inflater;

    public PayManagerAdapter(List<Customer> customerList, Context context) {
        this.customerList = customerList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return customerList.size();
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
        ViewHolder7 viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.pay_manager_list, null);
            viewHolder = new ViewHolder7();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder7) convertView.getTag();
        viewHolder.textView1.setText(customerList.get(position).getCustomerName());
        viewHolder.textView2.setText(customerList.get(position).getCustomerTel());
        return convertView;
    }
}
class ViewHolder7 {
    TextView textView1;
    TextView textView2;
}