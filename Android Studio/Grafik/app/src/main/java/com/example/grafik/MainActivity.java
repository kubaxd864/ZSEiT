package com.example.grafik;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        String deviceName = Build.MODEL;
        String deviceManufacturer = Build.MANUFACTURER;
        String osVersion = Build.VERSION.RELEASE;
        textView2.setText(deviceManufacturer + " " + deviceName + " " + "Android " + osVersion);


        @SuppressLint("WrongViewCast") LinearLayout layout = findViewById(R.id.layout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page1.class);
                startActivity(intent);
            }
        });
    }
}