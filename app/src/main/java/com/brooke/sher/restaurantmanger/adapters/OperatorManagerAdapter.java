package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.Waiter;

import java.util.List;

/**
 * Created by Sher on 2016/1/7.
 */
public class OperatorManagerAdapter extends BaseAdapter {
    private List<Waiter> waiterList;
    private LayoutInflater inflater;
    public OperatorManagerAdapter(List<Waiter> waiterList, Context context){
        this.waiterList = waiterList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return waiterList.size();
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
        ViewHolder6 viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.operator_manager_list, null);
            viewHolder = new ViewHolder6();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.textView3 = (TextView) convertView.findViewById(R.id.textView3);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder6) convertView.getTag();
        viewHolder.textView1.setText(waiterList.get(position).getWaiterName());
        viewHolder.textView2.setText(String.valueOf(waiterList.get(position).getBasicSales()));
        viewHolder.textView3.setText(String.valueOf(waiterList.get(position).getTiCheng()));
        return convertView;
    }
}
class ViewHolder6 {
    TextView textView1;
    TextView textView2;
    TextView textView3;
}