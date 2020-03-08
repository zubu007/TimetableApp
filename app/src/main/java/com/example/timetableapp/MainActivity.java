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
        Button btn603;
        Button btn604;
        Button btn605;
        Button btn606;
        Button btn607;
        Button btn651;
        Button btn652;
        Button btn653;
        Button btn654;
        Button btn655;
        Button btn656;
        Button btn657;
        Button btn701;
        Button btn702;
        Button btn703;
        Button btn704;
        Button btn705;
        Button btn706;
        Button btn707;
        Button btn751;
        Button btn752;
        Button btn753;


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
