package com.example.grafik;

        import androidx.appcompat.app.AppCompatActivity;
        import android.app.AlertDialog;
        import android.app.DatePickerDialog;
        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteStatement;
        import android.os.Bundle;
        import android.provider.Settings;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.DatePicker;
        import android.widget.EditText;
        import android.widget.Spinner;

        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.textfield.TextInputEditText;
        import com.google.android.material.textfield.TextInputLayout;

        import java.util.Calendar;

public class Page1 extends AppCompatActivity implements View.OnClickListener
{
    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    private String date;
    private Integer id = 0;
    private String name;
    private String surname;
    private String gender;
    private String email;
    private String address;
    private String state;
    private String postcode;
    private String city;
    private String text;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatePicker();
        getSupportActionBar().hide();
        dateButton = findViewById(R.id.datepicker);
        dateButton.setText(getTodaysDate());
        TextInputLayout textInputLayout = findViewById(R.id.name);
        String text = String.valueOf(textInputLayout.getEditText().getText());
        Spinner spinner = findViewById(R.id.state);
        String selectedItem = spinner.getSelectedItem().toString();
        ((FloatingActionButton) findViewById(R.id.menuButton)).setOnClickListener(this);
        ((Button) findViewById(R.id.register)).setOnClickListener(this);
        db = openOrCreateDatabase("BazaTestowa", MODE_PRIVATE, null);
        String sqlDB = "CREATE TABLE IF NOT EXISTS KLIENCI2 (Id INTEGER, Name VARCHAR, Surname VARCHAR, Gender VARCHAR, Date VARCHAR, Email VARCHAR, Address VARCHAR, State VARCHAR, PostCode VARCHAR, City VARCHAR, Text VARCHAR)";
        db.execSQL(sqlDB);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuButton:
                Intent myIntent = new Intent(this, MainActivity.class);
                startActivity(myIntent);
                break;

            case R.id.register:
                TextInputLayout Name = findViewById(R.id.name);
                name = String.valueOf(Name.getEditText().getText());
                TextInputLayout SurName = findViewById(R.id.surname);
                surname = String.valueOf(SurName.getEditText().getText());
                CheckBox men = (CheckBox)findViewById(R.id.gender_men);
                CheckBox women = (CheckBox)findViewById(R.id.gender_women);
                if(men.isChecked()){
                    gender = "Mężczyzna";
                }
                else if(women.isChecked()){
                    gender = "Kobieta";
                }
                TextInputLayout Email = findViewById(R.id.email);
                email = String.valueOf(Email.getEditText().getText());
                TextInputLayout Address = findViewById(R.id.address);
                address = String.valueOf(Address.getEditText().getText());
                Spinner mySpinner = (Spinner) findViewById(R.id.state);
                state = mySpinner.getSelectedItem().toString();
                TextInputLayout PostCode = findViewById(R.id.postcode);
                postcode = String.valueOf(PostCode.getEditText().getText());
                TextInputLayout City = findViewById(R.id.city);
                city = String.valueOf(City.getEditText().getText());
                EditText TextArea = findViewById(R.id.textArea);
                text = String.valueOf(TextArea.getText());
                addToDatebase();
        }
    }

    public void addToDatebase(){
        id++;
        String sqlStudent = "INSERT INTO KLIENCI2 VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        SQLiteStatement statement = db.compileStatement(sqlStudent);
        statement.bindLong(1, id);
        statement.bindString(2, name);
        statement.bindString(3, surname);
        statement.bindString(4, gender);
        statement.bindString(5, date);
        statement.bindString(6, email);
        statement.bindString(7, address);
        statement.bindString(8, state);
        statement.bindString(9, postcode);
        statement.bindString(10, city);
        statement.bindString(11, text);
        statement.executeInsert();
    }

    private String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                date = makeDateString(day, month+1, year);
                dateButton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);

    }

    private String makeDateString(int day, int month, int year)
    {
        return day + " " + getMonthFormat(month) + " " + year;
    }

    private String getMonthFormat(int month)
    {
        if(month == 1)
            return "STYCZEŃ";
        if(month == 2)
            return "LUTY";
        if(month == 3)
            return "MARZEC";
        if(month == 4)
            return "KWIECIEŃ";
        if(month == 5)
            return "MAJ";
        if(month == 6)
            return "CZERWIEC";
        if(month == 7)
            return "LIPIEC";
        if(month == 8)
            return "SIERPIEŃ";
        if(month == 9)
            return "WRZESIEŃ";
        if(month == 10)
            return "PAŹDZIERNIK";
        if(month == 11)
            return "LISTOPAD";
        if(month == 12)
            return "GRUDZIEŃ";

        return "BŁĄD";
    }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }
}
