package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        final TextView Temp_Celsius  = (TextView) findViewById(R.id.TC);
        String tempcelsius = Temp_Celsius.getText().toString();
        final TextView Temp_Kelvin = (TextView) findViewById(R.id.TK);
        String tempkelvin = Temp_Kelvin.getText().toString();
        final TextView Temp_Fahrenheit = (TextView) findViewById(R.id.TF);
        String tempfahrenheit = Temp_Fahrenheit.getText().toString();
        if (tempcelsius.length() > 0)
        {
            Integer tempc = Integer.valueOf(tempcelsius);
            String tempk = String.valueOf(tempc + 273.15 + "K");
            Temp_Kelvin.setText(tempk);

            String tempf = String.valueOf((tempc*1.8) + 32+"℉");
            Temp_Fahrenheit.setText(tempf);
        }
        else if(tempkelvin.length() > 0)
        {
            Integer tempk = Integer.valueOf(tempkelvin);
            String tempc = String.valueOf(tempk - 273.15 + "℃");
            Temp_Celsius.setText(tempc);

            String tempf = String.valueOf(((tempk - 273.15)*1.8)+32+"℉");
            Temp_Fahrenheit.setText(tempf);
        }
        else if(tempfahrenheit.length() > 0)
        {
            Integer tempf = Integer.valueOf(tempfahrenheit);
            String tempc = String.valueOf((tempf - 32)/1.8 + "℃");
            Temp_Celsius.setText(tempc);

            String tempk = String.valueOf(((tempf - 32)/1.8)+ 273.15 +"K");
            Temp_Kelvin.setText(tempk);
        }
    }
}