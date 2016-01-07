package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;

import java.util.Map;

/**
 * Created by Sher on 2016/1/7.
 */
public class AnalyzeOfRoomAndTableAdapter extends BaseAdapter {

    private Map<Integer,Integer> map;
    private LayoutInflater inflater;
    public AnalyzeOfRoomAndTableAdapter(Map<Integer,Integer> map, Context context) {
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
            convertView = inflater.inflate(R.layout.analyze_of_table_room_list, null);
            viewHolder = new ViewHolder8();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder8) convertView.getTag();
        viewHolder.textView1.setText(String.valueOf(position));
        viewHolder.textView2.setText(String.valueOf(map.get(position)));
        return convertView;
    }
}
class  ViewHolder8{
    TextView textView1;
    TextView textView2;
}