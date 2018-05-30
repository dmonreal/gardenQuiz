package com.monreal.deb.gardenquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class Q1 extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private int userPoints;
    private RadioButton correctAnswer;
    private ImageButton home;
    private Button submitButton;
    private String userPointsString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        sharedPref = getSharedPreferences(userPointsString,MODE_PRIVATE);

        correctAnswer = findViewById(R.id.r3);
        home = findViewById(R.id.homeButton);
        submitButton = findViewById(R.id.submitButton);
        userPointsString = getString(R.string.user_Points);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Q1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        userPoints = sharedPref.getInt(userPointsString, 0);
    }


    @Override
            protected void onPause(){
        super.onPause();
        sharedPref.edit().putInt(userPointsString, userPoints).commit();
    }


    public void submitAnswer(View view) {

        if (correctAnswer.isActivated()) {
            userPoints = userPoints + 1;
        } else {
            userPoints = userPoints;
        }



        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Q", userPoints);
        editor.apply();

        Toast.makeText(this, "Answer saved", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Q1.this, MainActivity.class);
        startActivity(intent);
    }
}


