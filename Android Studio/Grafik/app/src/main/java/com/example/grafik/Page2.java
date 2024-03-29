package com.example.grafik;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


public class Page2 extends AppCompatActivity implements View.OnClickListener, CalendarView.OnDateChangeListener  {
    ListView days = null;
    Set<String> dates = new HashSet<String>();
    ArrayList<String> dates2 = new ArrayList<String>();
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        getSupportActionBar().hide();
        ((FloatingActionButton) findViewById(R.id.menuButton)).setOnClickListener(this);
        ((CalendarView) findViewById(R.id.calendarView)).setOnDateChangeListener(this);
        days = findViewById(R.id.workoutDaysList);
        adapter = new ArrayAdapter<String>(this, R.layout.list_custom_text, dates2);
        days.setAdapter(adapter);
        if (dates.isEmpty()) {
            dates.add("Brak Zaplanowanych Wydarzeń");
        }
        ArrayAdapter<String> a = new ArrayAdapter<String>(this, R.layout.list_custom_text, R.id.list_content, Arrays.asList(dates.toArray(new String[dates.size()])));
        days.setAdapter(a);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuButton:
                Intent myIntent = new Intent(this, Page1.class);
                startActivity(myIntent);
                break;
        }
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        Calendar selectedDate = Calendar.getInstance();
        selectedDate.set(year, month, dayOfMonth);
        if (selectedDate.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            dates.add("Masz Dzisiaj Trening");
            dates.remove("Brak Zaplanowanych Wydarzeń");
            Toast.makeText(getApplicationContext(), "W Ten Dzień masz Trening ", Toast.LENGTH_SHORT).show();
        }else if (selectedDate.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
            dates.add("Masz Dzisiaj Trening");
            dates.remove("Brak Zaplanowanych Wydarzeń");
            Toast.makeText(getApplicationContext(), "W Ten Dzień masz Trening", Toast.LENGTH_SHORT).show();
        }else {
            dates.remove("Masz Dzisiaj Trening");
            dates.add("Brak Zaplanowanych Wydarzeń");
        }
        ArrayAdapter<String> a = new ArrayAdapter<String>(this, R.layout.list_custom_text, R.id.list_content, Arrays.asList(dates.toArray(new String[dates.size()])));
        days.setAdapter(a);
    }
}