package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAlarm(View view){
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Pora wstawać!")
                .putExtra(AlarmClock.EXTRA_HOUR, 17)
                .putExtra(AlarmClock.EXTRA_MINUTES, 54);
        startActivity(intent);
    }

    public void onClickTimer(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Odliczanie w dół!")
                .putExtra(AlarmClock.EXTRA_LENGTH, 15)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, false);
        startActivity(intent);
    }
}