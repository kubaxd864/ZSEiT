package com.example.grafik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Page2 extends AppCompatActivity implements View.OnClickListener  {
    SQLiteDatabase db;
    ListView days = null;
    Set<String> dates = new HashSet<String>();
    ArrayList<String> dates2 = new ArrayList<String>();
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        getSupportActionBar().hide();
        ((FloatingActionButton) findViewById(R.id.menuButton)).setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList<String> wyniki = new ArrayList<String>();
        Cursor c = db.rawQuery("SELECT Id, Name, Surname FROM KLIENCI", null);
        if (c.moveToFirst()) {
            do {
                int id = c.getInt(c.getColumnIndex("Id"));
                String imie = c.getString(c.getColumnIndex("Imie"));
                String nazwisko =
                        c.getString(c.getColumnIndex("Nazwisko"));
                wyniki.add("Id: " + id + ", Imię: " + imie + ",Nazwisko: " + nazwisko);
            } while (c.moveToNext());
        }
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wyniki);
        listView.setAdapter(adapter);
        c.close();
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.menuButton:
//                Intent myIntent = new Intent(this, MainActivity.class);
//                startActivity(myIntent);
//                break;
//        }
//    }
}