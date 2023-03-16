package com.example.grafik;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Page3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        getSupportActionBar().hide();
        TextView wynik = (TextView)findViewById(R.id.wynik);
        EditText waga = (EditText)findViewById(R.id.waga);
        EditText wysokosc = (EditText)findViewById(R.id.wysokosc);

        ((FloatingActionButton) findViewById(R.id.menuButton)).setOnClickListener(this);
        ((Button) findViewById(R.id.calc_btn)).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                float Waga = Float.parseFloat(waga.getText().toString());
                float Wysokosc = (Float.parseFloat(wysokosc.getText().toString())*Float.parseFloat(wysokosc.getText().toString()))/10000;
                float Wynik = Waga/Wysokosc;
                wynik.setText("Twoje BMI wynosi: " + String.valueOf(Wynik));
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuButton:
                Intent intent = new Intent(this, Page1.class);
                startActivity(intent);
                break;
        }
    }
}
