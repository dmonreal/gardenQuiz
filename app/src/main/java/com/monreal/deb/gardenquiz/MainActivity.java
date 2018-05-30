package com.monreal.deb.gardenquiz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL1, LL2, LL3, LL4, LL5, LL6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    };

    public void question1(View view){

        LL1 = findViewById(R.id.LL1);
        LL1.setBackgroundColor(Color.DKGRAY);

        Intent intent = new Intent(MainActivity.this, Q1.class);
        startActivity(intent);
    };

    public void question2(View view){

        LL2 = findViewById(R.id.LL2);

        Intent intent = new Intent(MainActivity.this, Q2.class);
        startActivity(intent);
    };

    public void question3(View view){

        LL3 = findViewById(R.id.LL3);

        Intent intent = new Intent(MainActivity.this, Q3.class);
        startActivity(intent);
    };
    public void question4(View view){

        LL4 = findViewById(R.id.LL4);

        Intent intent = new Intent(MainActivity.this, Q4.class);
        startActivity(intent);
    };
    public void question5(View view){

        LL5 = findViewById(R.id.LL5);

        Intent intent = new Intent(MainActivity.this, Q5.class);
        startActivity(intent);
    };
    public void question6(View view){

        LL6 = findViewById(R.id.LL6);

        Intent intent = new Intent(MainActivity.this, Q6.class);
        startActivity(intent);
    };

}



