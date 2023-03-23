package com.example.zad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
    }
    public void onClickWczytaj(View view){
        try {
            FileInputStream fIn = openFileInput("textfile.txt");
            InputStreamReader isr = new InputStreamReader(fIn);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String linia;
            while ((linia = reader.readLine()) != null) {
                sb.append(linia).append("\n");
            }
            reader.close();

            editText.setText(sb.toString());
            Toast.makeText(this, "Plik został wczytany!", Toast.LENGTH_SHORT).show();
        }        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void onClickZapisz(View view){
        String tekst = editText.getText().toString();
        try {
            FileOutputStream fOut = openFileOutput("textfile.txt", MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fOut);
            osw.write(tekst);
            osw.close();
            Toast.makeText(this, "Plik został zapisany!",Toast.LENGTH_SHORT).show();
            editText.setText("");
        }        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}