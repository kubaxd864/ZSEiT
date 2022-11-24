package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView show_info1;
    TextView show_info2;
    Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_info1 = findViewById(R.id.spalanie);
        show_info2 = findViewById(R.id.cena1);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        final TextView SpalonePaliwo  = (TextView) findViewById(R.id.spalonepaliwo);
        String SP = SpalonePaliwo.getText().toString();
        final TextView IloscKilometrow = (TextView) findViewById(R.id.ilosckilometrow);
        String IK = IloscKilometrow.getText().toString();
        final TextView Cena = (TextView) findViewById(R.id.cena);
        String C = Cena.getText().toString();
        if(SP.length() > 0 && IK.length() > 0 && C.length() > 0)
        {
            Float C2 = Float.valueOf(C);
            Float SP2 = Float.valueOf(SP);
            Float IK2 = Float.valueOf(IK);
            Float spalanie = Float.valueOf((SP2 / IK2) * 100);
            show_info1.setText("Twoje średnie spalanie wynosi: " + spalanie + "L na 100km");
            Float cena = Float.valueOf(spalanie * C2);
            show_info2.setText("Cena Twojego paliwa to: " + cena);

        }
        else
        {
            show_info1.setText("Podaj wszystkie Dane do Obliczeń");
        }
    }
}