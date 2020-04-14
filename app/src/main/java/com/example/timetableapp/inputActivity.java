package com.example.timetableapp;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class inputActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    TextView tv1;
    EditText nameText, typeText;
    Button btnStart, create, color;
    Button colorRed, colorBlue, colorGreen, colorPurple, colorSky, colorGray, colorOrange, colorYellow;
    Spinner duration, day;
    Dialog colorDialog;
    public int a, b, x, y, digit, z;
    public TimePickerFragment var;
    public int hour, min, value, time, dayNo;
    public String name, type, colorID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nameText = findViewById(R.id.nameText);
        typeText = findViewById(R.id.typeText);
        btnStart = findViewById(R.id.btnStartTime);
        duration = findViewById(R.id.duration);
        day = findViewById(R.id.day);
        color = findViewById(R.id.btnColor);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(inputActivity.this, R.array.duration, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        duration.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapterDay = ArrayAdapter.createFromResource(inputActivity.this, R.array.day, android.R.layout.simple_spinner_item);
        adapterDay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        day.setAdapter(adapterDay);

        colorDialog = new Dialog(this);

        tv1 = findViewById(R.id.textView);
        create = findViewById(R.id.btnCreate);


        a = getIntent().getIntExtra("A", 0);

        b = a;

        while(a>0)
        {
            a= a/10;
            digit ++;
        }

        x = b/100;
        y = ((b - (x*100)) /10) * 6;

        if(digit==4)
        {
            z = x -12;
            if(z>0)
            {
                x = x -12;
                btnStart.setText("Hour: "+ x + " Minute: "+ y + " PM" );
            }else if(z==0)
            {

                btnStart.setText("Hour: " + (x) + " Minute: " + y + " PM");
            } else
            {
                btnStart.setText("Hour: "+ x + " Minute: "+ y + " AM" );
            }

        }else
            btnStart.setText("Hour: "+ x + " Minute: "+ y + " AM" );




        

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timepicker = new TimePickerFragment();
                timepicker.show(getSupportFragmentManager(), "time picker");
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameText.getText().toString();
                type = typeText.getText().toString();
                time = duration.getSelectedItemPosition();
                dayNo = day.getSelectedItemPosition();
                Intent intent = new Intent(inputActivity.this, MainActivity.class);
                intent.putExtra("NAME", name); //string
                intent.putExtra("TYPE", type); //string
                intent.putExtra("VALUE", value); //string
                intent.putExtra("TIME", time); //int
                intent.putExtra("DAY", dayNo);
                intent.putExtra("COLOR", colorID); //string
                startActivity(intent);

            }
        });

    }

    public void openDialog(){
        colorDialog.setContentView(R.layout.layout_dialog);
        colorRed = colorDialog.findViewById(R.id.colorRed);
        colorBlue = colorDialog.findViewById(R.id.colorBlue);
        colorGreen = colorDialog.findViewById(R.id.colorGreen);
        colorPurple = colorDialog.findViewById(R.id.colorPurple);
        colorYellow = colorDialog.findViewById(R.id.colorYellow);
        colorGray = colorDialog.findViewById(R.id.colorGray);
        colorSky = colorDialog.findViewById(R.id.colorSky);
        colorOrange = colorDialog.findViewById(R.id.colorOrange);

        colorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "red";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "blue";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "green";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "purple";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "yellow";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "orange";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorSky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "Sky";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorID = "gray";
                color.setText(colorID);
                colorDialog.dismiss();
            }
        });
        colorDialog.show();
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        btnStart.setText("Hour: "+ hourOfDay + "Minute: "+ minute);
        hour = hourOfDay;
        min = minute;

        if(hour == 6 && min<30)
            value = 600;
        else if(hour == 6 && min > 30)
            value = 630;
        else if(hour == 7 && min < 30)
            value = 700;
        else if(hour == 7 && min > 30)
            value = 730;
        else if(hour == 8 && min < 30)
            value = 800;
        else if(hour == 8 && min > 30)
            value = 830;
        else if(hour == 9 && min < 30)
            value = 900;
        else if(hour == 9 && min > 30)
            value = 930;
        else if(hour == 10 && min < 30)
            value = 1000;
        else if(hour == 10 && min > 30)
            value = 1030;
        else if(hour == 11 && min < 30)
            value = 1100;
        else if(hour == 11 && min > 30)
            value = 1130;
        else if(hour == 12 && min < 30)
            value = 1200;
        else if(hour == 12 && min > 30)
            value = 1230;
        else if(hour == 13 && min < 30)
            value = 1300;
        else if(hour == 13 && min > 30)
            value = 1330;
        else if(hour == 14 && min < 30)
            value = 1400;
        else if(hour == 14 && min > 30)
            value = 1430;
        else if(hour == 15 && min < 30)
            value = 1500;
        else if(hour == 15 && min > 30)
            value = 1530;
        else if(hour == 16 && min < 30)
            value = 1600;
        else if(hour == 16 && min > 30)
            value = 1630;
        else if(hour == 17 && min < 30)
            value = 1700;
        else if(hour == 17 && min > 30)
            value = 1730;
        else if(hour == 18 && min < 30)
            value = 1800;
        else if(hour == 18 && min > 30)
            value = 1830;
        else if(hour == 19 && min < 30)
            value = 1900;
        else if(hour == 19 && min > 30)
            value = 1930;
        else if(hour == 20 && min < 30)
            value = 2000;
        else if(hour == 20 && min > 30)
            value = 2030;
        else if(hour == 21 && min < 30)
            value = 2100;
        else if(hour == 21 && min > 30)
            value = 2130;
        else if(hour == 22 && min < 30)
            value = 2200;
        else if(hour == 22 && min > 30)
            value = 2230;

    }


}
