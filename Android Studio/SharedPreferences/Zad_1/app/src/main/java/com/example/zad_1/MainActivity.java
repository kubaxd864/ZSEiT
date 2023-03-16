package com.example.zad_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences appPrefs =
                getPreferences(MODE_PRIVATE);
        String tekst = appPrefs.getString("editText", "");
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(tekst);

        boolean wl = appPrefs.getBoolean("checkBox", false);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setChecked(wl);
    }

    public void onClick(View view) {
        SharedPreferences sharedPreferences =
                getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        EditText editText = (EditText) findViewById(R.id.editText);
        String tekst = editText.getText().toString();
        prefsEditor.putString("editText", tekst);

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        boolean wl = checkBox.isChecked();
        prefsEditor.putBoolean("checkBox", wl);
        prefsEditor.commit();
    }
}