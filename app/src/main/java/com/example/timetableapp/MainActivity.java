package com.example.timetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int a;
    public String A;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        A = "a";

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
        Button btn951 = findViewById(R.id.btn930am_1);
        Button btn952 = findViewById(R.id.btn930am_2);
        Button btn953 = findViewById(R.id.btn930am_3);
        Button btn954 = findViewById(R.id.btn930am_4);
        Button btn955 = findViewById(R.id.btn930am_5);
        Button btn956 = findViewById(R.id.btn930am_6);
        Button btn957 = findViewById(R.id.btn930am_7);
        Button btn1001 = findViewById(R.id.btn1000am_1);
        Button btn1002 = findViewById(R.id.btn1000am_2);
        Button btn1003 = findViewById(R.id.btn1000am_3);
        Button btn1004 = findViewById(R.id.btn1000am_4);
        Button btn1005 = findViewById(R.id.btn1000am_5);
        Button btn1006 = findViewById(R.id.btn1000am_6);
        Button btn1007 = findViewById(R.id.btn1000am_7);
        Button btn1051 = findViewById(R.id.btn1030am_1);
        Button btn1052 = findViewById(R.id.btn1030am_2);
        Button btn1053 = findViewById(R.id.btn1030am_3);
        Button btn1054 = findViewById(R.id.btn1030am_4);
        Button btn1055 = findViewById(R.id.btn1030am_5);
        Button btn1056 = findViewById(R.id.btn1030am_6);
        Button btn1057 = findViewById(R.id.btn1030am_7);
        Button btn1101 = findViewById(R.id.btn1100am_1);
        Button btn1102 = findViewById(R.id.btn1100am_2);
        Button btn1103 = findViewById(R.id.btn1100am_3);
        Button btn1104 = findViewById(R.id.btn1100am_4);
        Button btn1105 = findViewById(R.id.btn1100am_5);
        Button btn1106 = findViewById(R.id.btn1100am_6);
        Button btn1107 = findViewById(R.id.btn1100am_7);
        Button btn1151 = findViewById(R.id.btn1130am_1);
        Button btn1152 = findViewById(R.id.btn1130am_2);
        Button btn1153 = findViewById(R.id.btn1130am_3);
        Button btn1154 = findViewById(R.id.btn1130am_4);
        Button btn1155 = findViewById(R.id.btn1130am_5);
        Button btn1156 = findViewById(R.id.btn1130am_6);
        Button btn1157 = findViewById(R.id.btn1130am_7);
        Button btn1201 = findViewById(R.id.btn1200pm_1);
        Button btn1202 = findViewById(R.id.btn1200pm_2);
        Button btn1203 = findViewById(R.id.btn1200pm_3);
        Button btn1204 = findViewById(R.id.btn1200pm_4);
        Button btn1205 = findViewById(R.id.btn1200pm_5);
        Button btn1206 = findViewById(R.id.btn1200pm_6);
        Button btn1207 = findViewById(R.id.btn1200pm_7);
        Button btn1251 = findViewById(R.id.btn1230pm_1);
        Button btn1252 = findViewById(R.id.btn1230pm_2);
        Button btn1253 = findViewById(R.id.btn1230pm_3);
        Button btn1254 = findViewById(R.id.btn1230pm_4);
        Button btn1255 = findViewById(R.id.btn1230pm_5);
        Button btn1256 = findViewById(R.id.btn1230pm_6);
        Button btn1257 = findViewById(R.id.btn1230pm_7);
        Button btn1301 = findViewById(R.id.btn100pm_1);
        Button btn1302 = findViewById(R.id.btn100pm_2);
        Button btn1303 = findViewById(R.id.btn100pm_3);
        Button btn1304 = findViewById(R.id.btn100pm_4);
        Button btn1305 = findViewById(R.id.btn100pm_5);
        Button btn1306 = findViewById(R.id.btn100pm_6);
        Button btn1307 = findViewById(R.id.btn100pm_7);
        Button btn1351 = findViewById(R.id.btn130pm_1);
        Button btn1352 = findViewById(R.id.btn130pm_2);
        Button btn1353 = findViewById(R.id.btn130pm_3);
        Button btn1354 = findViewById(R.id.btn130pm_4);
        Button btn1355 = findViewById(R.id.btn130pm_5);
        Button btn1356 = findViewById(R.id.btn130pm_6);
        Button btn1357 = findViewById(R.id.btn130pm_7);
        Button btn1401 = findViewById(R.id.btn200pm_1);
        Button btn1402 = findViewById(R.id.btn200pm_2);
        Button btn1403 = findViewById(R.id.btn200pm_3);
        Button btn1404 = findViewById(R.id.btn200pm_4);
        Button btn1405 = findViewById(R.id.btn200pm_5);
        Button btn1406 = findViewById(R.id.btn200pm_6);
        Button btn1407 = findViewById(R.id.btn200pm_7);
        Button btn1451 = findViewById(R.id.btn230pm_1);
        Button btn1452 = findViewById(R.id.btn230pm_2);
        Button btn1453 = findViewById(R.id.btn230pm_3);
        Button btn1454 = findViewById(R.id.btn230pm_4);
        Button btn1455 = findViewById(R.id.btn230pm_5);
        Button btn1456 = findViewById(R.id.btn230pm_6);
        Button btn1457 = findViewById(R.id.btn230pm_7);
        Button btn1501 = findViewById(R.id.btn300pm_1);
        Button btn1502 = findViewById(R.id.btn300pm_2);
        Button btn1503 = findViewById(R.id.btn300pm_3);
        Button btn1504 = findViewById(R.id.btn300pm_4);
        Button btn1505 = findViewById(R.id.btn300pm_5);
        Button btn1506 = findViewById(R.id.btn300pm_6);
        Button btn1507 = findViewById(R.id.btn300pm_7);
        Button btn1551 = findViewById(R.id.btn330pm_1);
        Button btn1552 = findViewById(R.id.btn330pm_2);
        Button btn1553 = findViewById(R.id.btn330pm_3);
        Button btn1554 = findViewById(R.id.btn330pm_4);
        Button btn1555 = findViewById(R.id.btn330pm_5);
        Button btn1556 = findViewById(R.id.btn330pm_6);
        Button btn1557 = findViewById(R.id.btn330pm_7);
        Button btn1601 = findViewById(R.id.btn400pm_1);
        Button btn1602 = findViewById(R.id.btn400pm_2);
        Button btn1603 = findViewById(R.id.btn400pm_3);
        Button btn1604 = findViewById(R.id.btn400pm_4);
        Button btn1605 = findViewById(R.id.btn400pm_5);
        Button btn1606 = findViewById(R.id.btn400pm_6);
        Button btn1607 = findViewById(R.id.btn400pm_7);
        Button btn1651 = findViewById(R.id.btn430pm_1);
        Button btn1652 = findViewById(R.id.btn430pm_2);
        Button btn1653 = findViewById(R.id.btn430pm_3);
        Button btn1654 = findViewById(R.id.btn430pm_4);
        Button btn1655 = findViewById(R.id.btn430pm_5);
        Button btn1656 = findViewById(R.id.btn430pm_6);
        Button btn1657 = findViewById(R.id.btn430pm_7);
        Button btn1701 = findViewById(R.id.btn500pm_1);
        Button btn1702 = findViewById(R.id.btn500pm_2);
        Button btn1703 = findViewById(R.id.btn500pm_3);
        Button btn1704 = findViewById(R.id.btn500pm_4);
        Button btn1705 = findViewById(R.id.btn500pm_5);
        Button btn1706 = findViewById(R.id.btn500pm_6);
        Button btn1707 = findViewById(R.id.btn500pm_7);
        Button btn1751 = findViewById(R.id.btn530pm_1);
        Button btn1752 = findViewById(R.id.btn530pm_2);
        Button btn1753 = findViewById(R.id.btn530pm_3);
        Button btn1754 = findViewById(R.id.btn530pm_4);
        Button btn1755 = findViewById(R.id.btn530pm_5);
        Button btn1756 = findViewById(R.id.btn530pm_6);
        Button btn1757 = findViewById(R.id.btn530pm_7);
        Button btn1801 = findViewById(R.id.btn600pm_1);
        Button btn1802 = findViewById(R.id.btn600pm_2);
        Button btn1803 = findViewById(R.id.btn600pm_3);
        Button btn1804 = findViewById(R.id.btn600pm_4);
        Button btn1805 = findViewById(R.id.btn600pm_5);
        Button btn1806 = findViewById(R.id.btn600pm_6);
        Button btn1807 = findViewById(R.id.btn600pm_7);
        Button btn1851 = findViewById(R.id.btn630pm_1);
        Button btn1852 = findViewById(R.id.btn630pm_2);
        Button btn1853 = findViewById(R.id.btn630pm_3);
        Button btn1854 = findViewById(R.id.btn630pm_4);
        Button btn1855 = findViewById(R.id.btn630pm_5);
        Button btn1856 = findViewById(R.id.btn630pm_6);
        Button btn1857 = findViewById(R.id.btn630pm_7);
        Button btn1901 = findViewById(R.id.btn700pm_1);
        Button btn1902 = findViewById(R.id.btn700pm_2);
        Button btn1903 = findViewById(R.id.btn700pm_3);
        Button btn1904 = findViewById(R.id.btn700pm_4);
        Button btn1905 = findViewById(R.id.btn700pm_5);
        Button btn1906 = findViewById(R.id.btn700pm_6);
        Button btn1907 = findViewById(R.id.btn700pm_7);
        Button btn1951 = findViewById(R.id.btn730pm_1);
        Button btn1952 = findViewById(R.id.btn730pm_2);
        Button btn1953 = findViewById(R.id.btn730pm_3);
        Button btn1954 = findViewById(R.id.btn730pm_4);
        Button btn1955 = findViewById(R.id.btn730pm_5);
        Button btn1956 = findViewById(R.id.btn730pm_6);
        Button btn1957 = findViewById(R.id.btn730pm_7);
        Button btn2001 = findViewById(R.id.btn800pm_1);
        Button btn2002 = findViewById(R.id.btn800pm_2);
        Button btn2003 = findViewById(R.id.btn800pm_3);
        Button btn2004 = findViewById(R.id.btn800pm_4);
        Button btn2005 = findViewById(R.id.btn800pm_5);
        Button btn2006 = findViewById(R.id.btn800pm_6);
        Button btn2007 = findViewById(R.id.btn800pm_7);
        Button btn2051 = findViewById(R.id.btn830pm_1);
        Button btn2052 = findViewById(R.id.btn830pm_2);
        Button btn2053 = findViewById(R.id.btn830pm_3);
        Button btn2054 = findViewById(R.id.btn830pm_4);
        Button btn2055 = findViewById(R.id.btn830pm_5);
        Button btn2056 = findViewById(R.id.btn830pm_6);
        Button btn2057 = findViewById(R.id.btn830pm_7);
        Button btn2101 = findViewById(R.id.btn900pm_1);
        Button btn2102 = findViewById(R.id.btn900pm_2);
        Button btn2103 = findViewById(R.id.btn900pm_3);
        Button btn2104 = findViewById(R.id.btn900pm_4);
        Button btn2105 = findViewById(R.id.btn900pm_5);
        Button btn2106 = findViewById(R.id.btn900pm_6);
        Button btn2107 = findViewById(R.id.btn900pm_7);
        Button btn2151 = findViewById(R.id.btn930pm_1);
        Button btn2152 = findViewById(R.id.btn930pm_2);
        Button btn2153 = findViewById(R.id.btn930pm_3);
        Button btn2154 = findViewById(R.id.btn930pm_4);
        Button btn2155 = findViewById(R.id.btn930pm_5);
        Button btn2156 = findViewById(R.id.btn930pm_6);
        Button btn2157 = findViewById(R.id.btn930pm_7);
        Button btn2201 = findViewById(R.id.btn1000pm_1);
        Button btn2202 = findViewById(R.id.btn1000pm_2);
        Button btn2203 = findViewById(R.id.btn1000pm_3);
        Button btn2204 = findViewById(R.id.btn1000pm_4);
        Button btn2205 = findViewById(R.id.btn1000pm_5);
        Button btn2206 = findViewById(R.id.btn1000pm_6);
        Button btn2207 = findViewById(R.id.btn1000pm_7);
        Button btn2251 = findViewById(R.id.btn1030pm_1);
        Button btn2252 = findViewById(R.id.btn1030pm_2);
        Button btn2253 = findViewById(R.id.btn1030pm_3);
        Button btn2254 = findViewById(R.id.btn1030pm_4);
        Button btn2255 = findViewById(R.id.btn1030pm_5);
        Button btn2256 = findViewById(R.id.btn1030pm_6);
        Button btn2257 = findViewById(R.id.btn1030pm_7);



        btn601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 601;
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });

        btn602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 602;
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                intent.putExtra("A", a);
                startActivity(intent);

            }
        });
        btn603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 603;
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                intent.putExtra("A", a);
                startActivity(intent);

            }
        });
        btn604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 604;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn605.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 605;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 606;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn607.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 607;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 651;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn652.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 652;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn653.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 653;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn654.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 654;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn655.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 655;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn656.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 656;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn657.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 657;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 701;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 702;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 703;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 704;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 705;
                intent.putExtra("A", a);
                startActivity(intent);
                a = 705;
            }
        });
        btn706.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 706;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 707;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 751;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 752;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 753;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 754;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn755.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 755;
                intent.putExtra("A", a);
                startActivity(intent);
                a = 75;
            }
        });
        btn756.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 756;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn757.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 757;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 801;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn802.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 802;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn803.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 803;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn804.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 801;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 805;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn806.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 806;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn807.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 807;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn851.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 851;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn852.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 852;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn853.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 853;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn854.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 854;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn855.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 855;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn856.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 856;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn857.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 857;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 901;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn902.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 902;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn903.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 903;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn904.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 904;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn905.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 905;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn906.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 906;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn907.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 907;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn951.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 951;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn952.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 952;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 953;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn954.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 954;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn955.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 955;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 956;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn957.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 957;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1001;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1002;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1003;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1004;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1005;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1006;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1007;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1051;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1052;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1053;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1054;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1055;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1056;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1057;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1101;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1102;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1103;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1104;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1105;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1106;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1107;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1151;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1152;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1153;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1154;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1155;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1156;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1157;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1201;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1202;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1203;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1204;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1205;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1206;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1207;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1251;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1252;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1253;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1254;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1255;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1256;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1257;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1301;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1302;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1303;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1304;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1305;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1306;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1307;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1351.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1351;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1352;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1353;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1354;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1355;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1356;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1357;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1401.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1401;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1402;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1403;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1404;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1405;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1406;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1407.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1407;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1451.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1451;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1452;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1453;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1454;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1455.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1455;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1456;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1457.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1457;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1501;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1502;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1503;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1504.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1504;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1505.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1505;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1506.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1506;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1507.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1507;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1551;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1552.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1552;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1553.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1553;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1554.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1554;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1555.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1555;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1556.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1556;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1557.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1557;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1601;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1602;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1603;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1604;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1605.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1605;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1606;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1607.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1607;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1651;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1652.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1652;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1653.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1653;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1654.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1654;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1655.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1655;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1656.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1656;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1657.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1657;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1701;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1702;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1703;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1704;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1705;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1706.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1706;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1707;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1751;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1752;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1753;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1754;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1755.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1755;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1756.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1756;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1757.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1757;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1801;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1802.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1802;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1803.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1803;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1804.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1804;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1805;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1806.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1806;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1807.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1807;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1851.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1851;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1852.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1852;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1853.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1853;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1854.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1854;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1855.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1855;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1856.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1856;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1857.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1857;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1901;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1902.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1902;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1903.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1903;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1904.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1904;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1905.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1905;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1906.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1906;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1907.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1907;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1951.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1951;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1952.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1952;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1953;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1954.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1954;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1955.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1955;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1956;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn1957.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 1957;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2001;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2002;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2003;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2004;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2005;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2006;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2007;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2051;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2052;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2053;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2054;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2055;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2056;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2057;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2101;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2102;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2103;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2104;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2105;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2106;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2107;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2151;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2152;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2153;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2154;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2155;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2156;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2157;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2201;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2202;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2203;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2204;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2205;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2206;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2207;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2251;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2252;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2253;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2254;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2255;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2256;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });
        btn2257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                a = 2257;
                intent.putExtra("A", a);
                startActivity(intent);
            }
        });















    }
}
