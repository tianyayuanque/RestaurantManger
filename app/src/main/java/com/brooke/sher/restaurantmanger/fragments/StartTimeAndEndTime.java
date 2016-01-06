package com.brooke.sher.restaurantmanger.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;
import android.app.Fragment;
import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.beans.DaysState;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.Calendar;

/**
 * 日始日结
 *
 */
public class StartTimeAndEndTime extends Fragment {
    private TimePicker timePicker;
    private TimePicker timePicker1;
    private Button button;
    private Calendar cal;
    private int year;
    private int month;
    private int dayOfMonth;
    private int hour;
    private int min;
    private int hour1;
    private int min1;
    private DbManager db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_start_time_and_end_time, container, false);

        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH);
        dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        timePicker = (TimePicker) view.findViewById(R.id.timePicker_start);
        timePicker1 = (TimePicker) view.findViewById(R.id.timePicker_end);
        button = (Button) view.findViewById(R.id.button_submit);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = hourOfDay;
                min = minute;
            }
        });
        timePicker1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour1 = hourOfDay;
                min1 = minute;
            }
        });
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
                    db = x.getDb(daoConfig);
                    DaysState daysState = new DaysState();
                    daysState.setDate(year+":"+month+":"+dayOfMonth);
                    daysState.setStartTime(hour+":"+min);
                    daysState.setEndTime(hour1+":"+min1);
                    try {
                        db.save(daysState);
                    } catch (DbException e) {
                        e.printStackTrace();
                    }
                    getFragmentManager().beginTransaction().replace(R.id.frame_content,new Reservation()).commit();
            }
            });

        return view;
    }

}
