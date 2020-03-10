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
        btn603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 603;
            }
        });
        btn604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 604;
            }
        });
        btn605.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 605;
            }
        });
        btn606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 606;
            }
        });
        btn607.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 607;
            }
        });
        btn651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 651;
            }
        });
        btn652.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 652;
            }
        });
        btn653.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 653;
            }
        });
        btn654.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 654;
            }
        });
        btn655.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 65;
            }
        });
        btn656.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 656;
            }
        });
        btn657.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 657;
            }
        });
        btn701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 701;
            }
        });
        btn702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 702;
            }
        });
        btn703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 703;
            }
        });
        btn704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 704;
            }
        });
        btn705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 705;
            }
        });
        btn706.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 706;
            }
        });
        btn707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 707;
            }
        });
        btn751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 751;
            }
        });
        btn752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 752;
            }
        });
        btn753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 753;
            }
        });
        btn754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 754;
            }
        });
        btn755.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 755;
            }
        });
        btn756.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 756;
            }
        });
        btn757.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 757;
            }
        });
        btn801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 801;
            }
        });
        btn802.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 802;
            }
        });
        btn803.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 803;
            }
        });
        btn804.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 804;
            }
        });
        btn805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 805;
            }
        });
        btn806.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 806;
            }
        });
        btn807.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 807;
            }
        });
        btn851.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 851;
            }
        });
        btn852.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 852;
            }
        });
        btn853.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 853;
            }
        });
        btn854.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 854;
            }
        });
        btn855.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 855;
            }
        });
        btn856.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 856;
            }
        });
        btn857.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 857;
            }
        });
        btn901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 901;
            }
        });
        btn902.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 902;
            }
        });
        btn903.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 903;
            }
        });
        btn904.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 904;
            }
        });
        btn905.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 905;
            }
        });
        btn906.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 906;
            }
        });
        btn907.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 907;
            }
        });
        btn951.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 951;
            }
        });
        btn952.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 952;
            }
        });
        btn953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 953;
            }
        });
        btn954.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 954;
            }
        });
        btn955.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 955;
            }
        });
        btn956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 956;
            }
        });
        btn957.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 957;
            }
        });
        btn1001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1001;
            }
        });
        btn1002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1002;
            }
        });
        btn1003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1003;
            }
        });
        btn1004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1004;
            }
        });
        btn1005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1005;
            }
        });
        btn1006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1006;
            }
        });
        btn1007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1007;
            }
        });
        btn1051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1051;
            }
        });
        btn1052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1052;
            }
        });
        btn1053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1053;
            }
        });
        btn1054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1054;
            }
        });
        btn1055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1055;
            }
        });
        btn1056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1056;
            }
        });
        btn1057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1057;
            }
        });
        btn1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1101;
            }
        });
        btn1102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1102;
            }
        });
        btn1103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1103;
            }
        });
        btn1104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1104;
            }
        });
        btn1105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1105;
            }
        });
        btn1106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1106;
            }
        });
        btn1107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1107;
            }
        });
        btn1151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1151;
            }
        });
        btn1152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1152;
            }
        });
        btn1153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1153;
            }
        });
        btn1154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1154;
            }
        });
        btn1155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1155;
            }
        });
        btn1156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1156;
            }
        });
        btn1157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1157;
            }
        });
        btn1201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1201;
            }
        });
        btn1202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1202;
            }
        });
        btn1203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1203;
            }
        });
        btn1204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1204;
            }
        });
        btn1205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1205;
            }
        });
        btn1206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1206;
            }
        });
        btn1207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1207;
            }
        });
        btn1251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1251;
            }
        });
        btn1252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1252;
            }
        });
        btn1253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1253;
            }
        });
        btn1254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1254;
            }
        });
        btn1255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1255;
            }
        });
        btn1256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1256;
            }
        });
        btn1257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1257;
            }
        });
        btn1301.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1301;
            }
        });
        btn1302.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1302;
            }
        });
        btn1303.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1303;
            }
        });
        btn1304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1304;
            }
        });
        btn1305.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1305;
            }
        });
        btn1306.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1306;
            }
        });
        btn1307.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1307;
            }
        });
        btn1351.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1351;
            }
        });
        btn1352.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1352;
            }
        });
        btn1353.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1353;
            }
        });
        btn1354.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1354;
            }
        });
        btn1355.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1355;
            }
        });
        btn1356.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1356;
            }
        });
        btn1357.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1357;
            }
        });
        btn1401.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1401;
            }
        });
        btn1402.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1402;
            }
        });
        btn1403.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1403;
            }
        });
        btn1404.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1404;
            }
        });
        btn1405.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1405;
            }
        });
        btn1406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1406;
            }
        });
        btn1407.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1407;
            }
        });
        btn1451.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1451;
            }
        });
        btn1452.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1452;
            }
        });
        btn1453.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1453;
            }
        });
        btn1454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1454;
            }
        });
        btn1455.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1455;
            }
        });
        btn1456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1456;
            }
        });
        btn1457.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1457;
            }
        });
        btn1501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1501;
            }
        });
        btn1502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1502;
            }
        });
        btn1503.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1503;
            }
        });
        btn1504.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1504;
            }
        });
        btn1505.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1505;
            }
        });
        btn1506.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1506;
            }
        });
        btn1507.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1507;
            }
        });
        btn1551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1551;
            }
        });
        btn1552.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1552;
            }
        });
        btn1553.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1553;
            }
        });
        btn1554.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1554;
            }
        });
        btn1555.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1555;
            }
        });
        btn1556.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1556;
            }
        });
        btn1557.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1557;
            }
        });
        btn1601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1601;
            }
        });
        btn1602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1602;
            }
        });
        btn1603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1603;
            }
        });
        btn1604.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1604;
            }
        });
        btn1605.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1605;
            }
        });
        btn1606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1606;
            }
        });
        btn1607.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1607;
            }
        });
        btn1651.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1651;
            }
        });
        btn1652.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1652;
            }
        });
        btn1653.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1653;
            }
        });
        btn1654.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1654;
            }
        });
        btn1655.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1655;
            }
        });
        btn1656.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1656;
            }
        });
        btn1657.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1657;
            }
        });
        btn1701.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1701;
            }
        });
        btn1702.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1702;
            }
        });
        btn1703.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1703;
            }
        });
        btn1704.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1704;
            }
        });
        btn1705.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1705;
            }
        });
        btn1706.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1706;
            }
        });
        btn1707.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1707;
            }
        });
        btn1751.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1751;
            }
        });
        btn1752.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1752;
            }
        });
        btn1753.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1753;
            }
        });
        btn1754.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1754;
            }
        });
        btn1755.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1755;
            }
        });
        btn1756.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1756;
            }
        });
        btn1757.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1757;
            }
        });
        btn1801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1801;
            }
        });
        btn1802.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1802;
            }
        });
        btn1803.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1803;
            }
        });
        btn1804.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1804;
            }
        });
        btn1805.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1805;
            }
        });
        btn1806.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1806;
            }
        });
        btn1807.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1807;
            }
        });
        btn1851.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1851;
            }
        });
        btn1852.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1852;
            }
        });
        btn1853.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1853;
            }
        });
        btn1854.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1854;
            }
        });
        btn1855.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1855;
            }
        });
        btn1856.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1856;
            }
        });
        btn1857.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1857;
            }
        });
        btn1901.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1901;
            }
        });
        btn1902.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1902;
            }
        });
        btn1903.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1903;
            }
        });
        btn1904.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1904;
            }
        });
        btn1905.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1905;
            }
        });
        btn1906.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1906;
            }
        });
        btn1907.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1907;
            }
        });
        btn1951.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1951;
            }
        });
        btn1952.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1952;
            }
        });
        btn1953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1953;
            }
        });
        btn1954.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1954;
            }
        });
        btn1955.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1955;
            }
        });
        btn1956.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1956;
            }
        });
        btn1957.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 1957;
            }
        });
        btn2001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2001;
            }
        });
        btn2002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2002;
            }
        });
        btn2003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2003;
            }
        });
        btn2004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2004;
            }
        });
        btn2005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2005;
            }
        });
        btn2006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2006;
            }
        });
        btn2007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2007;
            }
        });
        btn2051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2051;
            }
        });
        btn2052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2052;
            }
        });
        btn2053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2053;
            }
        });
        btn2054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2054;
            }
        });
        btn2055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2055;
            }
        });
        btn2056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2056;
            }
        });
        btn2057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2057;
            }
        });
        btn2101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2101;
            }
        });
        btn2102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2102;
            }
        });
        btn2103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2103;
            }
        });
        btn2104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2104;
            }
        });
        btn2105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2105;
            }
        });
        btn2106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2106;
            }
        });
        btn2107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2107;
            }
        });
        btn2151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2151;
            }
        });
        btn2152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2152;
            }
        });
        btn2153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2153;
            }
        });
        btn2154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2154;
            }
        });
        btn2155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2155;
            }
        });
        btn2156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2156;
            }
        });
        btn2157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2157;
            }
        });
        btn2201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2201;
            }
        });
        btn2202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2202;
            }
        });
        btn2203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2203;
            }
        });
        btn2204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2204;
            }
        });
        btn2205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2205;
            }
        });
        btn2206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2206;
            }
        });
        btn2207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2207;
            }
        });
        btn2251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2251;
            }
        });
        btn2252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2252;
            }
        });
        btn2253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2253;
            }
        });
        btn2254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2254;
            }
        });
        btn2255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2255;
            }
        });
        btn2256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2256;
            }
        });
        btn2257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
                a = 2257;
            }
        });















    }
}
