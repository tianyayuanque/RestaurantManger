package com.brooke.sher.restaurantmanger.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;

import java.util.List;

/**
 * Created by Sher on 2016/1/4.
 */
public class TableOrRoomAdapter extends BaseAdapter {
    private List<TableORRoom> tOrList;
    private LayoutInflater inflater;
    public TableOrRoomAdapter(List<TableORRoom> tOrList,Context context){
        this.tOrList = tOrList;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return tOrList.size();
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
        ViewHolder viewHolder;
        if (convertView==null){
            convertView = inflater.inflate(R.layout.reservation_list,null);
            viewHolder = new ViewHolder();
            viewHolder.textView1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.textView2);
            viewHolder.textView3 = (TextView) convertView.findViewById(R.id.textView3);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) convertView.getTag();
        TableORRoom tOrInfo = tOrList.get(position) ;
        viewHolder.textView1.setText(String.valueOf(tOrInfo.gettOrRNum()));
        viewHolder.textView2.setText(tOrInfo.gettOrRType());
        viewHolder.textView3.setText(tOrInfo.gettOrRState());
        return convertView;
    }
}
class ViewHolder{
    TextView textView1;
    TextView textView2;
    TextView textView3;

}