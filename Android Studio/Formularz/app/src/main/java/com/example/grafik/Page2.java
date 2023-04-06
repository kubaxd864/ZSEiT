package com.example.grafik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Page2 extends AppCompatActivity implements View.OnClickListener {
    private Integer id;
    ListView days = null;
    Set<String> dates = new HashSet<String>();
    List<String> wyniki = new ArrayList<String>();
    ArrayList<String> dates2 = new ArrayList<String>();
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        getSupportActionBar().hide();
        ((FloatingActionButton) findViewById(R.id.menuButton)).setOnClickListener(this);
        ((Button) findViewById(R.id.button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.menuButton:
                Intent myIntent = new Intent(this, MainActivity.class);
                startActivity(myIntent);
                break;

            case R.id.button:
                SQLiteDatabase db = openOrCreateDatabase("BazaTestowa", MODE_PRIVATE, null);
                Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM KLIENCI2", null);
                cursor.moveToFirst();
                int count = cursor.getInt(0);
                if (count == 0){
                    int itemCount = wyniki.size();
                    if(itemCount == 0){
                        wyniki.add("Brak Klientów W Bazie Danych");
                        ListView listView = (ListView) findViewById(R.id.listView);
                        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, wyniki);
                        listView.setAdapter(adapter);
                    }
                    else {
                        break;
                    }
                }
                else {
                    Cursor c = db.rawQuery("SELECT * FROM KLIENCI2", null);
                    if (c.moveToFirst()) {
                        do {
                            int id = c.getInt(c.getColumnIndex("Id"));
                            String name = c.getString(c.getColumnIndex("Name"));
                            String surname = c.getString(c.getColumnIndex("Surname"));
                            String gender = c.getString(c.getColumnIndex("Gender"));
                            String date = c.getString(c.getColumnIndex("Date"));
                            String email = c.getString(c.getColumnIndex("Email"));
                            String address = c.getString(c.getColumnIndex("Address"));
                            String state = c.getString(c.getColumnIndex("State"));
                            String postcode = c.getString(c.getColumnIndex("PostCode"));
                            String city = c.getString(c.getColumnIndex("City"));
                            String text = c.getString(c.getColumnIndex("Text"));
                            wyniki.add(" Id: " + id + "\n" + " Name: " + name + "\n" + " Surname: " + surname + "\n" + " Gender: " + gender + "\n" + " Date: " + date + "\n" + " Email: " + email + "\n" + " Address: " + address + "\n" + " State: " + state + "\n" + " PostCode: " + postcode + "\n" + " City: " + city + "\n" + " Text: " + text);
                        } while (c.moveToNext());
                    }

                    ListView listView = (ListView) findViewById(R.id.listView);
                    adapter = new ArrayAdapter<String>(this, R.layout.list_item_layout, R.id.textView, wyniki) {
                        public View getView(int position, View convertView, ViewGroup parent)
                        {
                            View view = super.getView(position, convertView, parent);
                            TextView textView = view.findViewById(R.id.textView);
                            Button button = view.findViewById(R.id.deletebutton);
                            String item = getItem(position);
                            textView.setText(item);

                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v)
                                {
                                    Cursor c = db.rawQuery("SELECT Id FROM KLIENCI2 LIMIT 1 OFFSET " + position, null);
                                    c.moveToFirst();
                                    int id = c.getInt(c.getColumnIndex("Id"));
                                    c.close();

                                    db.delete("KLIENCI2", "Id=" + id, null);

                                    wyniki.remove(position);
                                    notifyDataSetChanged();
                                    Toast.makeText(getApplicationContext(), "Usunięto Klienta Z Bazy", Toast.LENGTH_LONG).show();
                                }
                            });
                            return view;
                        }
                    };
                    listView.setAdapter(adapter);
                    break;
                }
        }
    }
}