package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Page1 extends Activity implements View.OnClickListener{
    Button polska;
    Button litwa;
    Button bialorus;
    Button niemcy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_1);

        polska = findViewById(R.id.polska);
        litwa = findViewById(R.id.litwa);
        bialorus = findViewById(R.id.bialorus);
        niemcy = findViewById(R.id.niemcy);

        polska.setOnClickListener(this);
        litwa.setOnClickListener(this);
        bialorus.setOnClickListener(this);
        niemcy.setOnClickListener(this);
    }

    public static class Global {
        public static String wynik;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == polska.getId()){
            polska.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
            Global.wynik = "1";
            polska.setEnabled(false);
            litwa.setEnabled(false);
            bialorus.setEnabled(false);
            niemcy.setEnabled(false);
        }
        if(v.getId() == litwa.getId()){
            litwa.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
            Global.wynik = "0";
            polska.setEnabled(false);
            litwa.setEnabled(false);
            bialorus.setEnabled(false);
            niemcy.setEnabled(false);
        }
        if(v.getId() == bialorus.getId()){
            bialorus.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
            Global.wynik = "0";
            polska.setEnabled(false);
            litwa.setEnabled(false);
            bialorus.setEnabled(false);
            niemcy.setEnabled(false);
        }
        if(v.getId() == niemcy.getId()){
            niemcy.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
            Global.wynik = "0";
            polska.setEnabled(false);
            litwa.setEnabled(false);
            bialorus.setEnabled(false);
            niemcy.setEnabled(false);
        }
    }
}
