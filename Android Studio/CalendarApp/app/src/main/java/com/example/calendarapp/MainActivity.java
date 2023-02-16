package com.example.calendarapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Now = findViewById(R.id.Now);
        TextView Birthday = findViewById(R.id.Birthday);
        TextView Year = findViewById(R.id.Year);
        TextView Summer = findViewById(R.id.Summer);

        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date data = currentDate.getTime();
        String Day = LocalDate.now().getDayOfWeek().name();
        Now.setText(Day + " " + dateFormat.format(data));

        Calendar BirthdayDate = Calendar.getInstance();
        BirthdayDate.set(2024, Calendar.FEBRUARY, 13);
        long diff = BirthdayDate.getTimeInMillis() - currentDate.getTimeInMillis();
        int daysToBirthday = (int) (diff / (24 * 60 * 60 * 1000));
        Birthday.setText(daysToBirthday + " dni");

        Calendar EndYearDate = Calendar.getInstance();
        EndYearDate.set(2023, Calendar.DECEMBER, 31);
        long diff1 = EndYearDate.getTimeInMillis() - currentDate.getTimeInMillis();
        int daysToEndYear = (int) (diff1 / (24 * 60 * 60 * 1000));
        Year.setText(daysToEndYear + " dni");

        Calendar VacationDate = Calendar.getInstance();
        VacationDate.set(2023, Calendar.JUNE, 26);
        long diff2 = VacationDate.getTimeInMillis() - currentDate.getTimeInMillis();
        int daysToVacation = (int) (diff2 / (24 * 60 * 60 * 1000));
        Summer.setText(daysToVacation + " dni");

    }
}