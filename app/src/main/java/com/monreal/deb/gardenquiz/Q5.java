package com.monreal.deb.gardenquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Scanner;

public class Q5 extends AppCompatActivity {

    int userPoints;
    String userInput;
    EditText userAnswer;
    ImageButton home;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);


        userAnswer = (EditText) findViewById(R.id.userInput);


        home = findViewById(R.id.homeButton);
        submitButton = findViewById(R.id.submitButton);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Q5.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void submitAnswer (View view) {

        if(userAnswer.getText().toString() == "water"){
            userPoints = userPoints + 1;
        }
        else{
            userPoints = userPoints;
        }

        SharedPreferences sharedPref = getSharedPreferences("userPoints", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Q", userPoints);
        editor.apply();

        Toast.makeText(this, "Answer saved", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent (Q5.this, MainActivity.class);
        startActivity(intent);


    }
}
