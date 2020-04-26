package com.example.timetableapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public int[] buttonId = {
            R.id.btn0601, R.id.btn0602, R.id.btn0603, R.id.btn0604, R.id.btn0605, R.id.btn0606, R.id.btn0607,
            R.id.btn0651, R.id.btn0652, R.id.btn0653, R.id.btn0654, R.id.btn0655, R.id.btn0656, R.id.btn0657,
            R.id.btn0701, R.id.btn0702, R.id.btn0703, R.id.btn0704, R.id.btn0705, R.id.btn0706, R.id.btn0707,
            R.id.btn0751, R.id.btn0752, R.id.btn0753, R.id.btn0754, R.id.btn0755, R.id.btn0756, R.id.btn0757,
            R.id.btn0801, R.id.btn0802, R.id.btn0803, R.id.btn0804, R.id.btn0805, R.id.btn0806, R.id.btn0807,
            R.id.btn0851, R.id.btn0852, R.id.btn0853, R.id.btn0854, R.id.btn0855, R.id.btn0856, R.id.btn0857,
            R.id.btn0901, R.id.btn0902, R.id.btn0903, R.id.btn0904, R.id.btn0905, R.id.btn0906, R.id.btn0907,
            R.id.btn0951, R.id.btn0952, R.id.btn0953, R.id.btn0954, R.id.btn0955, R.id.btn0956, R.id.btn0957,
            R.id.btn1001, R.id.btn1002, R.id.btn1003, R.id.btn1004, R.id.btn1005, R.id.btn1006, R.id.btn1007,
            R.id.btn1051, R.id.btn1052, R.id.btn1053, R.id.btn1054, R.id.btn1055, R.id.btn1056, R.id.btn1057,
            R.id.btn1101, R.id.btn1102, R.id.btn1103, R.id.btn1104, R.id.btn1105, R.id.btn1106, R.id.btn1107,
            R.id.btn1151, R.id.btn1152, R.id.btn1153, R.id.btn1154, R.id.btn1155, R.id.btn1156, R.id.btn1157,
            R.id.btn1201, R.id.btn1202, R.id.btn1203, R.id.btn1204, R.id.btn1205, R.id.btn1206, R.id.btn1207,
            R.id.btn1251, R.id.btn1252, R.id.btn1253, R.id.btn1254, R.id.btn1255, R.id.btn1256, R.id.btn1257,
            R.id.btn1301, R.id.btn1302, R.id.btn1303, R.id.btn1304, R.id.btn1305, R.id.btn1306, R.id.btn1307,
            R.id.btn1351, R.id.btn1352, R.id.btn1353, R.id.btn1354, R.id.btn1355, R.id.btn1356, R.id.btn1357,
            R.id.btn1401, R.id.btn1402, R.id.btn1403, R.id.btn1404, R.id.btn1405, R.id.btn1406, R.id.btn1407,
            R.id.btn1451, R.id.btn1452, R.id.btn1453, R.id.btn1454, R.id.btn1455, R.id.btn1456, R.id.btn1457,
            R.id.btn1501, R.id.btn1502, R.id.btn1503, R.id.btn1504, R.id.btn1505, R.id.btn1506, R.id.btn1507,
            R.id.btn1551, R.id.btn1552, R.id.btn1553, R.id.btn1554, R.id.btn1555, R.id.btn1556, R.id.btn1557,
            R.id.btn1601, R.id.btn1602, R.id.btn1603, R.id.btn1604, R.id.btn1605, R.id.btn1606, R.id.btn1607,
            R.id.btn1651, R.id.btn1652, R.id.btn1653, R.id.btn1654, R.id.btn1655, R.id.btn1656, R.id.btn1657,
            R.id.btn1701, R.id.btn1702, R.id.btn1703, R.id.btn1704, R.id.btn1705, R.id.btn1706, R.id.btn1707,
            R.id.btn1751, R.id.btn1752, R.id.btn1753, R.id.btn1754, R.id.btn1755, R.id.btn1756, R.id.btn1757,
            R.id.btn1801, R.id.btn1802, R.id.btn1803, R.id.btn1804, R.id.btn1805, R.id.btn1806, R.id.btn1807,
            R.id.btn1851, R.id.btn1852, R.id.btn1853, R.id.btn1854, R.id.btn1855, R.id.btn1856, R.id.btn1857,
            R.id.btn1901, R.id.btn1902, R.id.btn1903, R.id.btn1904, R.id.btn1905, R.id.btn1906, R.id.btn1907,
            R.id.btn1951, R.id.btn1952, R.id.btn1953, R.id.btn1954, R.id.btn1955, R.id.btn1956, R.id.btn1957,
            R.id.btn2001, R.id.btn2002, R.id.btn2003, R.id.btn2004, R.id.btn2005, R.id.btn2006, R.id.btn2007,
            R.id.btn2051, R.id.btn2052, R.id.btn2053, R.id.btn2054, R.id.btn2055, R.id.btn2056, R.id.btn2057,
            R.id.btn2101, R.id.btn2102, R.id.btn2103, R.id.btn2104, R.id.btn2105, R.id.btn2106, R.id.btn2107,
            R.id.btn2151, R.id.btn2152, R.id.btn2153, R.id.btn2154, R.id.btn2155, R.id.btn2156, R.id.btn2157,
            R.id.btn2201, R.id.btn2202, R.id.btn2203, R.id.btn2204, R.id.btn2205, R.id.btn2206, R.id.btn2207,
            R.id.btn2251, R.id.btn2252, R.id.btn2253, R.id.btn2254, R.id.btn2255, R.id.btn2256, R.id.btn2257,
            };

    public int[] a = new int[buttonId.length];

    public Button[] button = new Button[buttonId.length];

    public int i, j, k, targetBtn, duration, time, day;

    public String name, type, color;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = getIntent().getIntExtra("VALUE", 0);
        day = getIntent().getIntExtra("DAY", 0);
        targetBtn = time + day + 1;
        name = getIntent().getStringExtra("NAME");
        type = getIntent().getStringExtra("TYPE");
        duration = getIntent().getIntExtra("TIME", 0);
        color = getIntent().getStringExtra("COLOR");



        ArrayList<Data> dataList = new ArrayList<Data>();

        // each button needs
        // 1. static- name
        // 2. text
        // 3. location
        // 4. color
        // 5. static- time and day

        Data button600am = new Data();


        for(i = 0; i < buttonId.length; i ++){
            button[i] = findViewById(buttonId[i]);

            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String id = v.getResources().getResourceName(v.getId());
                    int idValue = Integer.parseInt(id.substring(id.length()-4));
                    Intent intent = new Intent(MainActivity.this, inputActivity.class);
                    intent.putExtra("ID", idValue);
                    startActivity(intent);

                }
            });

        }


        //create an array a[] to store the last digits of each button ID
        //to cross check which button has been targeted.

        for(j=0; j < buttonId.length; j++){
            String ID = getResources().getResourceEntryName(button[j].getId());
            a[j] = Integer.parseInt(ID.substring(ID.length() - 4));
        }

        // check if the targeted button is in the a[] array

        for(k= 0; k < buttonId.length; k ++){
            if(a[k] == targetBtn){
                button[k].setText(name);
                switch (duration){
                    case 0:
                        button[k].getLayoutParams().height = (int) getResources().getDimension(R.dimen.height100);
                        button[k + 7].setVisibility(View.GONE);
                        break;
                    case 1:
                        button[k].getLayoutParams().height = (int) getResources().getDimension(R.dimen.height150);
                        button[k + 7].setVisibility(View.GONE);
                        button[k + 14].setVisibility(View.GONE);
                        break;
                    case 2:
                        button[k].getLayoutParams().height = (int) getResources().getDimension(R.dimen.height200);
                        button[k + 7].setVisibility(View.GONE);
                        button[k + 14].setVisibility(View.GONE);
                        button[k + 21].setVisibility(View.GONE);
                        break;
                    case 3:
                        button[k].getLayoutParams().height = (int) getResources().getDimension(R.dimen.height250);
                        button[k + 7].setVisibility(View.GONE);
                        button[k + 14].setVisibility(View.GONE);
                        button[k + 21].setVisibility(View.GONE);
                        button[k + 28].setVisibility(View.GONE);
                        break;
                    case 4:
                        button[k].getLayoutParams().height = (int) getResources().getDimension(R.dimen.height300);
                        button[k + 7].setVisibility(View.GONE);
                        button[k + 14].setVisibility(View.GONE);
                        button[k + 21].setVisibility(View.GONE);
                        button[k + 28].setVisibility(View.GONE);
                        button[k + 35].setVisibility(View.GONE);
                        break;
                    default:
                        break;

                }
            }
        }



    }
}
