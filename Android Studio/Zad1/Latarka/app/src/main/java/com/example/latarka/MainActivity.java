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
    Button bialy;
    LinearLayout bg;
    LinearLayout bg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bialy = findViewById(R.id.bialy);
        zolty = findViewById(R.id.zolty);
        zielony = findViewById(R.id.zielony);
        niebieski = findViewById(R.id.niebieski);
        czerwony = findViewById(R.id.czerwony);
        bg = findViewById(R.id.bg);
        bg1 = findViewById(R.id.bg1);
        bialy.setBackgroundColor(Color.WHITE);
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
        bialy.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId() == zolty.getId()){
            bg.setBackgroundColor(Color.YELLOW);
            bg1.setBackgroundColor(Color.YELLOW);
        }
        if(view.getId() == zielony.getId()){
            bg.setBackgroundColor(Color.GREEN);
            bg1.setBackgroundColor(Color.GREEN);
        }
        if(view.getId() == niebieski.getId()){
            bg.setBackgroundColor(Color.BLUE);
            bg1.setBackgroundColor(Color.BLUE);
        }
        if(view.getId() == czerwony.getId()){
            bg.setBackgroundColor(Color.RED);
            bg1.setBackgroundColor(Color.RED);
        }
        if(view.getId() == bialy.getId()){
            bg.setBackgroundColor(Color.WHITE);
            bg1.setBackgroundColor(Color.WHITE);
        }

    }
}