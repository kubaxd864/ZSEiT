package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page10 extends Activity implements View.OnClickListener{
    Button Argentyna;
    Button Kolumbia;
    Button Paragwaj;
    Button Brazylia;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_10);
        Argentyna = findViewById(R.id.argentyna);
        Kolumbia = findViewById(R.id.kolumbia);
        Paragwaj = findViewById(R.id.paragwaj);
        Brazylia = findViewById(R.id.brazylia);

        Argentyna.setOnClickListener(this);
        Kolumbia.setOnClickListener(this);
        Paragwaj.setOnClickListener(this);
        Brazylia.setOnClickListener(this);
    }

    public static class Global10 {
        public static String wynik10;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == Argentyna.getId()){
            Argentyna.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, EndPage.class);
            startActivity(intent);
            Global10.wynik10 = "1";
            Argentyna.setEnabled(false);
            Kolumbia.setEnabled(false);
            Paragwaj.setEnabled(false);
            Brazylia.setEnabled(false);
        }
        if(v.getId() == Kolumbia.getId()){
            Kolumbia.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, EndPage.class);
            startActivity(intent);
            Global10.wynik10 = "0";
            Argentyna.setEnabled(false);
            Kolumbia.setEnabled(false);
            Paragwaj.setEnabled(false);
            Brazylia.setEnabled(false);
        }
        if(v.getId() == Paragwaj.getId()){
            Paragwaj.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, EndPage.class);
            startActivity(intent);
            Global10.wynik10 = "0";
            Argentyna.setEnabled(false);
            Kolumbia.setEnabled(false);
            Paragwaj.setEnabled(false);
            Brazylia.setEnabled(false);
        }
        if(v.getId() == Brazylia.getId()){
            Brazylia.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, EndPage.class);
            startActivity(intent);
            Global10.wynik10 = "0";
            Argentyna.setEnabled(false);
            Kolumbia.setEnabled(false);
            Paragwaj.setEnabled(false);
            Brazylia.setEnabled(false);
        }
    }
}
