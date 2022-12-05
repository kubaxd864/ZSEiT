package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page9 extends Activity implements View.OnClickListener{
    Button Szwajcaria;
    Button Dania;
    Button Kanada;
    Button Norwegia;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_9);
        Szwajcaria = findViewById(R.id.szwajcaria);
        Dania = findViewById(R.id.dania);
        Kanada = findViewById(R.id.kanada);
        Norwegia = findViewById(R.id.norwegia);

        Szwajcaria.setOnClickListener(this);
        Dania.setOnClickListener(this);
        Kanada.setOnClickListener(this);
        Norwegia.setOnClickListener(this);
    }

    public static class Global9 {
        public static String wynik9;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == Szwajcaria.getId()){
            Szwajcaria.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page10.class);
            startActivity(intent);
            Global9.wynik9 = "1";
            Szwajcaria.setEnabled(false);
            Dania.setEnabled(false);
            Kanada.setEnabled(false);
            Norwegia.setEnabled(false);
        }
        if(v.getId() == Dania.getId()){
            Dania.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page10.class);
            startActivity(intent);
            Global9.wynik9 = "0";
            Szwajcaria.setEnabled(false);
            Dania.setEnabled(false);
            Kanada.setEnabled(false);
            Norwegia.setEnabled(false);
        }
        if(v.getId() == Kanada.getId()){
            Kanada.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page10.class);
            startActivity(intent);
            Global9.wynik9 = "0";
            Szwajcaria.setEnabled(false);
            Dania.setEnabled(false);
            Kanada.setEnabled(false);
            Norwegia.setEnabled(false);
        }
        if(v.getId() == Norwegia.getId()){
            Norwegia.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page10.class);
            startActivity(intent);
            Global9.wynik9 = "0";
            Szwajcaria.setEnabled(false);
            Dania.setEnabled(false);
            Kanada.setEnabled(false);
            Norwegia.setEnabled(false);
        }
    }
}
