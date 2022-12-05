package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page8 extends Activity implements View.OnClickListener{
    Button odra;
    Button wisla;
    Button narew;
    Button bug;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_8);
        odra = findViewById(R.id.Odra);
        wisla = findViewById(R.id.Wisla);
        narew = findViewById(R.id.Narew);
        bug = findViewById(R.id.Bug);

        odra.setOnClickListener(this);
        wisla.setOnClickListener(this);
        narew.setOnClickListener(this);
        bug.setOnClickListener(this);
    }

    public static class Global8 {
        public static String wynik8;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == odra.getId()){
            odra.setBackgroundColor(Color.GREEN);
            Intent intent = new Intent(this, Page9.class);
            startActivity(intent);
            Global8.wynik8 = "1";
            odra.setEnabled(false);
            wisla.setEnabled(false);
            narew.setEnabled(false);
            bug.setEnabled(false);
        }
        if(v.getId() == wisla.getId()){
            wisla.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page9.class);
            startActivity(intent);
            Global8.wynik8 = "0";
            odra.setEnabled(false);
            wisla.setEnabled(false);
            narew.setEnabled(false);
            bug.setEnabled(false);
        }
        if(v.getId() == narew.getId()){
            narew.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page9.class);
            startActivity(intent);
            Global8.wynik8 = "0";
            odra.setEnabled(false);
            wisla.setEnabled(false);
            narew.setEnabled(false);
            bug.setEnabled(false);
        }
        if(v.getId() == bug.getId()){
            bug.setBackgroundColor(Color.RED);
            Intent intent = new Intent(this, Page9.class);
            startActivity(intent);
            Global8.wynik8 = "0";
            odra.setEnabled(false);
            wisla.setEnabled(false);
            narew.setEnabled(false);
            bug.setEnabled(false);
        }
    }
}
