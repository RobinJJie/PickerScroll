package com.robin.picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.robin.scrollpicker.DatePicker;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=findViewById(R.id.dayPicker);
        datePicker.setDate(2019,2,2,2,2,true);
        datePicker.setIndicatorText("年","月","号","时","分");
        datePicker.setSelectedItemTextColor(getResources().getColor(R.color.colorAccent));
        datePicker.setOnDateSelectedListener(new DatePicker.OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day, int hour, int mint) {
                Log.e("time-ss",year+" "+month+ " "+day+" "+hour+" "+mint);
            }
        });


    }
}
