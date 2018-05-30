package com.monreal.deb.gardenquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Scanner;
import java.util.Set;

public class Q6 extends AppCompatActivity {

    private SharedPreferences sharedPref;
    private int userPoints;
    private String userPointsString;
    TextView pointsAwarded;
    ImageButton home;
    Button check;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        sharedPref = getSharedPreferences(userPointsString,MODE_PRIVATE);

        home = findViewById(R.id.homeButton);
        pointsAwarded = findViewById(R.id.pointsAwarded);
        check = findViewById(R.id.checkBtn);
        userPointsString = getString(R.string.user_Points);

        userPoints = sharedPref.getInt(userPointsString, 0);


        home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent (Q6.this, MainActivity.class);
            startActivity(intent); }
    });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int points = sharedPref.getInt(userPointsString, 0);
                pointsAwarded.setText(String.valueOf(points));
            }
        });



    }

}
