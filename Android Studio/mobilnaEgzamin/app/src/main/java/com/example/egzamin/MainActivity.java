package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button ok;
    TextView show_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_info = findViewById(R.id.show_info);
        ok = findViewById(R.id.ok);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        final TextView Email = (TextView) findViewById(R.id.Email);
        String email = Email.getText().toString();
        final TextView Password = (TextView) findViewById(R.id.Password);
        String password = Password.getText().toString();
        final TextView RepeatPassword = (TextView) findViewById(R.id.RepeatPassword);
        String repeat_password = RepeatPassword.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String emailPattern1 = "[a-zA-Z0-9._-]+@";
        String passwordPattern = password;
        if (!email.matches(emailPattern) && !email.matches(emailPattern1))
        {
            show_info.setText("Nieprawidłowy adres e-mail");
        }
        else if(!repeat_password.matches(passwordPattern))
        {
            show_info.setText("Hasła się różnią");
        }
        else
        {
            show_info.setText("Witaj: " + email);
        }
    }
}