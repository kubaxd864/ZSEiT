package com.example.formularz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button datebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatePicker();
        datebutton = findViewById(R.id.datepicker);
        datebutton.setText(getTodaysDate());
    }

    private String getTodaysDate(){

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);

    }

    private void initDatePicker(){
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String date = makeDateString(day, month, year);
                datebutton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
    }

    private String makeDateString(int day, int month, int year){
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month){
        if(month == 1)
            return "STYCZEŃ";
        if(month == 2)
            return "LUTY";
        if(month == 3)
            return "MARZEC";
        if(month == 4)
            return "KWIECIEŃ";
        if(month == 5)
            return "MAJ";
        if(month == 6)
            return "CZERWIEC";
        if(month == 7)
            return "LIPIEC";
        if(month == 8)
            return "SIERPIEŃ";
        if(month == 9)
            return "WRZESIEŃ";
        if(month == 10)
            return "PAŹDZIERNIK";
        if(month == 11)
            return "LISTOPAD";
        if(month == 12)
            return "GRUDZIEŃ";


        return "STYCZEŃ";
    };
}