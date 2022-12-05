package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page6 extends Activity implements View.OnClickListener{
    Button km140;
    Button km240;
    Button km440;
    Button km442;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_6);
        km140 = findViewById(R.id.km140);
        km240 = findViewById(R.id.km240);
        km440 = findViewById(R.id.km440);
        km442 = findViewById(R.id.km442);

        km140.setOnClickListener(this);
        km240.setOnClickListener(this);
        km440.setOnClickListener(this);
        km442.setOnClickListener(this);
    }

    public static class Global6 {
        public static String wynik6;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == km440.getId()){
            km440.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page7.class);
            startActivity(intent);
            Global6.wynik6 = "1";
            km140.setEnabled(false);
            km240.setEnabled(false);
            km440.setEnabled(false);
            km442.setEnabled(false);
        }
        if(v.getId() == km140.getId()){
            km140.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page7.class);
            startActivity(intent);
            Global6.wynik6 = "0";
            km140.setEnabled(false);
            km240.setEnabled(false);
            km440.setEnabled(false);
            km442.setEnabled(false);
        }
        if(v.getId() == km240.getId()){
            km240.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page7.class);
            startActivity(intent);
            Global6.wynik6 = "0";
            km140.setEnabled(false);
            km240.setEnabled(false);
            km440.setEnabled(false);
            km442.setEnabled(false);
        }
        if(v.getId() == km442.getId()){
            km442.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page7.class);
            startActivity(intent);
            Global6.wynik6 = "0";
            km140.setEnabled(false);
            km240.setEnabled(false);
            km440.setEnabled(false);
            km442.setEnabled(false);
        }
    }
}