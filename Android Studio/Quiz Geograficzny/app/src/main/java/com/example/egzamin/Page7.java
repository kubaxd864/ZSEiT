package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page7 extends Activity implements View.OnClickListener{
    Button wlochy;
    Button grecja;
    Button peru;
    Button Chorwacja;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_7);
        wlochy = findViewById(R.id.wlochy);
        grecja = findViewById(R.id.grecja);
        peru = findViewById(R.id.peru);
        Chorwacja = findViewById(R.id.Chorwacja);

        wlochy.setOnClickListener(this);
        grecja.setOnClickListener(this);
        peru.setOnClickListener(this);
        Chorwacja.setOnClickListener(this);
    }

    public static class Global7 {
        public static String wynik7;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == wlochy.getId()){
            wlochy.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page8.class);
            startActivity(intent);
            Global7.wynik7 = "1";
            wlochy.setEnabled(false);
            grecja.setEnabled(false);
            peru.setEnabled(false);
            Chorwacja.setEnabled(false);
        }
        if(v.getId() == grecja.getId()){
            grecja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page8.class);
            startActivity(intent);
            Global7.wynik7 = "0";
            wlochy.setEnabled(false);
            grecja.setEnabled(false);
            peru.setEnabled(false);
            Chorwacja.setEnabled(false);
        }
        if(v.getId() == peru.getId()){
            peru.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page8.class);
            startActivity(intent);
            Global7.wynik7 = "0";
            wlochy.setEnabled(false);
            grecja.setEnabled(false);
            peru.setEnabled(false);
            Chorwacja.setEnabled(false);
        }
        if(v.getId() == Chorwacja.getId()){
            Chorwacja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page8.class);
            startActivity(intent);
            Global7.wynik7 = "0";
            wlochy.setEnabled(false);
            grecja.setEnabled(false);
            peru.setEnabled(false);
            Chorwacja.setEnabled(false);
        }
    }
}
