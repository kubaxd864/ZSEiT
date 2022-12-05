package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page3 extends Activity implements View.OnClickListener{
    Button Litwa;
    Button Bialorus;
    Button Rosja;
    Button Slowacja;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3);
        Litwa = findViewById(R.id.Litwa);
        Bialorus = findViewById(R.id.Bialorus);
        Rosja = findViewById(R.id.Rosja);
        Slowacja = findViewById(R.id.Slowacja);

        Litwa.setOnClickListener(this);
        Bialorus.setOnClickListener(this);
        Rosja.setOnClickListener(this);
        Slowacja.setOnClickListener(this);
    }
    public static class Global3 {
        public static String wynik3;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == Litwa.getId()){
            Litwa.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page4.class);
            startActivity(intent);
            Global3.wynik3 = "1";
            Litwa.setEnabled(false);
            Bialorus.setEnabled(false);
            Rosja.setEnabled(false);
            Slowacja.setEnabled(false);
        }
        if(v.getId() == Bialorus.getId()){
            Bialorus.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page4.class);
            startActivity(intent);
            Global3.wynik3 = "0";
            Litwa.setEnabled(false);
            Bialorus.setEnabled(false);
            Rosja.setEnabled(false);
            Slowacja.setEnabled(false);
        }
        if(v.getId() == Rosja.getId()){
            Rosja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page4.class);
            startActivity(intent);
            Global3.wynik3 = "0";
            Litwa.setEnabled(false);
            Bialorus.setEnabled(false);
            Rosja.setEnabled(false);
            Slowacja.setEnabled(false);
        }
        if(v.getId() == Slowacja.getId()){
            Slowacja.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page4.class);
            startActivity(intent);
            Global3.wynik3 = "0";
            Litwa.setEnabled(false);
            Bialorus.setEnabled(false);
            Rosja.setEnabled(false);
            Slowacja.setEnabled(false);
        }
    }
}
