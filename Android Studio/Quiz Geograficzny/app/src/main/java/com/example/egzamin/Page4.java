package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page4 extends Activity implements View.OnClickListener{
    Button anglia;
    Button francja;
    Button austria;
    Button slowacja;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_4);
        anglia = findViewById(R.id.anglia);
        francja = findViewById(R.id.francja);
        austria = findViewById(R.id.austria);
        slowacja = findViewById(R.id.slowacja);

        anglia.setOnClickListener(this);
        francja.setOnClickListener(this);
        austria.setOnClickListener(this);
        slowacja.setOnClickListener(this);
    }

    public static class Global4 {
        public static String wynik4;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == anglia.getId()){
            anglia.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page5.class);
            startActivity(intent);
            Global4.wynik4 = "1";
            anglia.setEnabled(false);
            francja.setEnabled(false);
            austria.setEnabled(false);
            slowacja.setEnabled(false);
        }
        if(v.getId() == francja.getId()){
            francja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page5.class);
            startActivity(intent);
            Global4.wynik4 = "0";
            anglia.setEnabled(false);
            francja.setEnabled(false);
            austria.setEnabled(false);
            slowacja.setEnabled(false);
        }
        if(v.getId() == austria.getId()){
            austria.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page5.class);
            startActivity(intent);
            Global4.wynik4 = "0";
            anglia.setEnabled(false);
            francja.setEnabled(false);
            austria.setEnabled(false);
            slowacja.setEnabled(false);
        }
        if(v.getId() == slowacja.getId()){
            slowacja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page5.class);
            startActivity(intent);
            Global4.wynik4 = "0";
            anglia.setEnabled(false);
            francja.setEnabled(false);
            austria.setEnabled(false);
            slowacja.setEnabled(false);
        }
    }
}
