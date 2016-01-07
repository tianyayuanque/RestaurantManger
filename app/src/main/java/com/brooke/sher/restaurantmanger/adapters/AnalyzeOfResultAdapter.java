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
import java.util.Map;

/**
 * Created by Sher on 2016/1/7.
 */
public class AnalyzeOfResultAdapter extends BaseAdapter {

    private Map<String,Integer> map;
    private List<Waiter> waiterList;
    private LayoutInflater inflater;
    public AnalyzeOfResultAdapter(Map<String,Integer> map,List<Waiter> waiterList, Context context) {
        this.waiterList = waiterList;
        this.map = map;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return map.size();
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
            convertView = inflater.inflate(R.layout.analyze_of_result_list, null);
            viewHolder = new ViewHolder8();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder8) convertView.getTag();
        viewHolder.textView1.setText(waiterList.get(position).getWaiterName());
        viewHolder.textView2.setText(String.valueOf(map.get(waiterList.get(position).getWaiterName())));
        return convertView;
    }
}
