package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page5 extends Activity implements View.OnClickListener{
    Button Hiszpania;
    Button Szwecja;
    Button Chorwacja;
    Button Niderlandy;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_5);
        Hiszpania = findViewById(R.id.hiszpania);
        Szwecja = findViewById(R.id.szwecja);
        Chorwacja = findViewById(R.id.chorwacja);
        Niderlandy = findViewById(R.id.niderlandy);

        Hiszpania.setOnClickListener(this);
        Szwecja.setOnClickListener(this);
        Chorwacja.setOnClickListener(this);
        Niderlandy.setOnClickListener(this);
    }

    public static class Global5 {
        public static String wynik5;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == Niderlandy.getId()){
            Niderlandy.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page6.class);
            startActivity(intent);
            Global5.wynik5 = "1";
            Hiszpania.setEnabled(false);
            Szwecja.setEnabled(false);
            Chorwacja.setEnabled(false);
            Niderlandy.setEnabled(false);
        }
        if(v.getId() == Szwecja.getId()){
            Szwecja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page6.class);
            startActivity(intent);
            Global5.wynik5 = "0";
            Hiszpania.setEnabled(false);
            Szwecja.setEnabled(false);
            Chorwacja.setEnabled(false);
            Niderlandy.setEnabled(false);
        }
        if(v.getId() == Chorwacja.getId()){
            Chorwacja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page6.class);
            startActivity(intent);
            Global5.wynik5 = "0";
            Hiszpania.setEnabled(false);
            Szwecja.setEnabled(false);
            Chorwacja.setEnabled(false);
            Niderlandy.setEnabled(false);
        }
        if(v.getId() == Hiszpania.getId()){
            Hiszpania.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page6.class);
            startActivity(intent);
            Global5.wynik5 = "0";
            Hiszpania.setEnabled(false);
            Szwecja.setEnabled(false);
            Chorwacja.setEnabled(false);
            Niderlandy.setEnabled(false);
        }
    }
}
