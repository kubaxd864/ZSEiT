package com.example.latarka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button czerwony;
    Button niebieski;
    Button zielony;
    Button zolty;
    LinearLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zolty = findViewById(R.id.zolty);
        zielony = findViewById(R.id.zielony);
        niebieski = findViewById(R.id.niebieski);
        czerwony = findViewById(R.id.czerwony);
        bg = findViewById(R.id.bg);
        czerwony.setBackgroundColor(Color.RED);
        czerwony.setTextColor(Color.BLACK);
        niebieski.setBackgroundColor(Color.BLUE);
        niebieski.setTextColor(Color.BLACK);
        zielony.setBackgroundColor(Color.GREEN);
        zielony.setTextColor(Color.BLACK);
        zolty.setBackgroundColor(Color.YELLOW);
        zolty.setTextColor(Color.BLACK);

        zolty.setOnClickListener(this);
        zielony.setOnClickListener(this);
        niebieski.setOnClickListener(this);
        czerwony.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == zolty.getId()){
            bg.setBackgroundColor(Color.YELLOW);
        }
        if(view.getId() == zielony.getId()){
            bg.setBackgroundColor(Color.GREEN);
        }
        if(view.getId() == niebieski.getId()){
            bg.setBackgroundColor(Color.BLUE);
        }
        if(view.getId() == czerwony.getId()){
            bg.setBackgroundColor(Color.RED);
        }

    }
}