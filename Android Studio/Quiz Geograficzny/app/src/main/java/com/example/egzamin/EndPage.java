package com.example.egzamin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EndPage extends Activity implements View.OnClickListener{

    Button restart;
    TextView punkty;
    TextView procent;
    String punktywynik;
    int pkt;
    int procentwynik;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_page);
        restart = findViewById(R.id.restart);
        punkty = findViewById(R.id.punkty);
        procent = findViewById(R.id.procent);
        restart.setOnClickListener(this);
        Integer pkt1 = Integer.valueOf(Page1.Global.wynik);
        Integer pkt2 = Integer.valueOf(Page2.Global2.wynik2);
        Integer pkt3 = Integer.valueOf(Page3.Global3.wynik3);
        Integer pkt4 = Integer.valueOf(Page4.Global4.wynik4);
        Integer pkt5 = Integer.valueOf(Page5.Global5.wynik5);
        Integer pkt6 = Integer.valueOf(Page6.Global6.wynik6);
        Integer pkt7 = Integer.valueOf(Page7.Global7.wynik7);
        Integer pkt8 = Integer.valueOf(Page8.Global8.wynik8);
        Integer pkt9 = Integer.valueOf(Page9.Global9.wynik9);
        Integer pkt10 = Integer.valueOf(Page10.Global10.wynik10);
        pkt = (pkt1 + pkt2 + pkt3 + pkt4 + pkt5 + pkt6 + pkt7 + pkt8 + pkt9 + pkt10);
        procentwynik = (pkt * 10);
        punktywynik = String.valueOf(pkt + "/10 pkt");
        punkty.setText(punktywynik);
        procent.setText(String.valueOf(procentwynik + "%"));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
