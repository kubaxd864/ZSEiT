package com.example.grafik;

        import androidx.appcompat.app.AppCompatActivity;
        import android.app.AlertDialog;
        import android.app.DatePickerDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.provider.Settings;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.DatePicker;
        import android.widget.Spinner;

        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import com.google.android.material.textfield.TextInputEditText;
        import com.google.android.material.textfield.TextInputLayout;

        import java.util.Calendar;

public class Page1 extends AppCompatActivity implements View.OnClickListener
{
    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    private int Date;

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
                String name = String.valueOf(Name.getEditText().getText());
                TextInputLayout SurName = findViewById(R.id.name);
                String surname = String.valueOf(SurName.getEditText().getText());
                CheckBox men = (CheckBox)findViewById(R.id.gender_men);
                CheckBox women = (CheckBox)findViewById(R.id.gender_women);
                if(men.isChecked()){
                    String gender = "Men";
                    dateButton.setText("Men");
                }
                else if(women.isChecked()){
                    String gender = "Women";
                    dateButton.setText("Women");
                }

        }
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
                month = month + 1;
                String date = makeDateString(day, month, year);
                Settings.Global. = date;
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
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month)
    {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }
}
