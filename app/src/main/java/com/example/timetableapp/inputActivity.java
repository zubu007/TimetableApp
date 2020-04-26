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
    public int id, h, m, y, digit, z;
//    public TimePickerFragment var;
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


        id = getIntent().getIntExtra("ID", 0);

        //b = id;

        h = id/100;
        m = id - (h*100);

        if(h<12){
            if((m/50)== 0){
                btnStart.setText(h + ":00 AM");
            }else{
                btnStart.setText(h + ":30 AM");
            }
        }else{
            if((m/50)== 0){
                btnStart.setText(h-12 + ":00 AM");
            }else{
                btnStart.setText(h-12 + ":30 AM");
            }
        }



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
                intent.putExtra("VALUE", value); //int
                intent.putExtra("TIME", time); //int
                intent.putExtra("DAY", dayNo); //int
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
        hour = hourOfDay;
        min = minute;

        if(hour<12) {
            btnStart.setText(hour + ":" + min + " AM");
        }else{
            btnStart.setText(hour -12 + ":"+ min + " PM");
        }

        if(hour == 6 && min<=30)
            value = 600;
        else if(hour == 6 && min > 30)
            value = 650;
        else if(hour == 7 && min <= 30)
            value = 700;
        else if(hour == 7 && min > 30)
            value = 750;
        else if(hour == 8 && min <= 30)
            value = 800;
        else if(hour == 8 && min > 30)
            value = 850;
        else if(hour == 9 && min <= 30)
            value = 900;
        else if(hour == 9 && min > 30)
            value = 950;
        else if(hour == 10 && min <= 30)
            value = 1000;
        else if(hour == 10 && min > 30)
            value = 1050;
        else if(hour == 11 && min <= 30)
            value = 1100;
        else if(hour == 11 && min > 30)
            value = 1150;
        else if(hour == 12 && min <= 30)
            value = 1200;
        else if(hour == 12 && min > 30)
            value = 1250;
        else if(hour == 13 && min <= 30)
            value = 1300;
        else if(hour == 13 && min > 30)
            value = 1350;
        else if(hour == 14 && min <= 30)
            value = 1400;
        else if(hour == 14 && min > 30)
            value = 1450;
        else if(hour == 15 && min <= 30)
            value = 1500;
        else if(hour == 15 && min > 30)
            value = 1550;
        else if(hour == 16 && min <= 30)
            value = 1600;
        else if(hour == 16 && min > 30)
            value = 1650;
        else if(hour == 17 && min <= 30)
            value = 1700;
        else if(hour == 17 && min > 30)
            value = 1750;
        else if(hour == 18 && min <= 30)
            value = 1800;
        else if(hour == 18 && min > 30)
            value = 1850;
        else if(hour == 19 && min <= 30)
            value = 1900;
        else if(hour == 19 && min > 30)
            value = 1950;
        else if(hour == 20 && min <= 30)
            value = 2000;
        else if(hour == 20 && min > 30)
            value = 2050;
        else if(hour == 21 && min <= 30)
            value = 2100;
        else if(hour == 21 && min > 30)
            value = 2150;
        else if(hour == 22 && min <= 30)
            value = 2200;
        else if(hour == 22 && min > 30)
            value = 2250;

    }


}
