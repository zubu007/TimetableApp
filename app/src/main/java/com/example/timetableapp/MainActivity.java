package com.example.timetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int a;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = 0;

        Button btn601 = findViewById(R.id.btn600am_1);
        Button btn602 = findViewById(R.id.btn600am_2);
        Button btn603 = findViewById(R.id.btn600am_3);
        Button btn604 = findViewById(R.id.btn600am_4);
        Button btn605 = findViewById(R.id.btn600am_5);
        Button btn606 = findViewById(R.id.btn600am_6);
        Button btn607 = findViewById(R.id.btn600am_7);
        Button btn651 = findViewById(R.id.btn630am_1);
        Button btn652 = findViewById(R.id.btn630am_2);
        Button btn653 = findViewById(R.id.btn630am_3);
        Button btn654 = findViewById(R.id.btn630am_4);
        Button btn655 = findViewById(R.id.btn630am_5);
        Button btn656 = findViewById(R.id.btn630am_6);
        Button btn657 = findViewById(R.id.btn630am_7);
        Button btn701 = findViewById(R.id.btn700am_1);
        Button btn702 = findViewById(R.id.btn700am_2);
        Button btn703 = findViewById(R.id.btn700am_3);
        Button btn704 = findViewById(R.id.btn700am_4);
        Button btn705 = findViewById(R.id.btn700am_5);
        Button btn706 = findViewById(R.id.btn700am_6);
        Button btn707 = findViewById(R.id.btn700am_7);
        Button btn751 = findViewById(R.id.btn730am_1);
        Button btn752 = findViewById(R.id.btn730am_2);
        Button btn753 = findViewById(R.id.btn730am_3);
        Button btn754 = findViewById(R.id.btn730am_4);
        Button btn755 = findViewById(R.id.btn730am_5);
        Button btn756 = findViewById(R.id.btn730am_6);
        Button btn757 = findViewById(R.id.btn730am_7);
        Button btn801 = findViewById(R.id.btn800am_1);
        Button btn802 = findViewById(R.id.btn800am_2);
        Button btn803 = findViewById(R.id.btn800am_3);
        Button btn804 = findViewById(R.id.btn800am_4);
        Button btn805 = findViewById(R.id.btn800am_5);
        Button btn806 = findViewById(R.id.btn800am_6);
        Button btn807 = findViewById(R.id.btn800am_7);
        Button btn851 = findViewById(R.id.btn830am_1);
        Button btn852 = findViewById(R.id.btn830am_2);
        Button btn853 = findViewById(R.id.btn830am_3);
        Button btn854 = findViewById(R.id.btn830am_4);
        Button btn855 = findViewById(R.id.btn830am_5);
        Button btn856 = findViewById(R.id.btn830am_6);
        Button btn857 = findViewById(R.id.btn830am_7);
        Button btn901 = findViewById(R.id.btn900am_1);
        Button btn902 = findViewById(R.id.btn900am_2);
        Button btn903 = findViewById(R.id.btn900am_3);
        Button btn904 = findViewById(R.id.btn900am_4);
        Button btn905 = findViewById(R.id.btn900am_5);
        Button btn906 = findViewById(R.id.btn900am_6);
        Button btn907 = findViewById(R.id.btn900am_7);


        btn601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);

                a = 601;


            }
        });

        btn602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);

                a = 602;
            }
        });


    }
}
