package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page2 extends Activity implements View.OnClickListener{
    Button brama;
    Button wieza;
    Button katedra;
    Button palac;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        brama = findViewById(R.id.brama);
        wieza = findViewById(R.id.wieza);
        katedra = findViewById(R.id.katedra);
        palac = findViewById(R.id.palac);

        brama.setOnClickListener(this);
        wieza.setOnClickListener(this);
        katedra.setOnClickListener(this);
        palac.setOnClickListener(this);
    }

    public static class Global2 {
        public static String wynik2;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == brama.getId()){
            brama.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page3.class);
            startActivity(intent);
            Global2.wynik2 = "1";
            brama.setEnabled(false);
            wieza.setEnabled(false);
            katedra.setEnabled(false);
            palac.setEnabled(false);
        }
        if(v.getId() == wieza.getId()){
            wieza.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page3.class);
            startActivity(intent);
            Global2.wynik2 = "0";
            brama.setEnabled(false);
            wieza.setEnabled(false);
            katedra.setEnabled(false);
            palac.setEnabled(false);
        }
        if(v.getId() == katedra.getId()){
            katedra.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page3.class);
            startActivity(intent);
            Global2.wynik2 = "0";
            brama.setEnabled(false);
            wieza.setEnabled(false);
            katedra.setEnabled(false);
            palac.setEnabled(false);
        }
        if(v.getId() == palac.getId()){
            palac.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page3.class);
            startActivity(intent);
            Global2.wynik2 = "0";
            brama.setEnabled(false);
            wieza.setEnabled(false);
            katedra.setEnabled(false);
            palac.setEnabled(false);
        }
    }
}
