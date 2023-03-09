package com.example.grafik;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Page3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        getSupportActionBar().hide();
        TextView textview_res = (TextView)findViewById(R.id.result);
        EditText waga = (EditText)findViewById(R.id.waga);
        EditText wiek = (EditText)findViewById(R.id.wiek);
        EditText wysokosc = (EditText)findViewById(R.id.wysokosc);

        ((Button) findViewById(R.id.back)).setOnClickListener(this);
        ((Button) findViewById(R.id.calc)).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                float param1 = (float) (13.7 * Float.parseFloat(waga.getText().toString()));
                float param2 = 5 * Float.parseFloat(wysokosc.getText().toString());
                float param3 = (float) (6.8 * Float.parseFloat(wiek.getText().toString()));
                float result = 66 + param1 + param2 - param3;
                textview_res.setText("BMR: " + String.valueOf(result));
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
