package com.monreal.deb.gardenquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class Q4 extends AppCompatActivity {

    int userPoints;
    CheckBox correctAnswer;
    CheckBox correctAnswer2;
    ImageButton home;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);


        correctAnswer = findViewById(R.id.chbx1);
        correctAnswer2 = findViewById(R.id.ckbx2);
        home = findViewById(R.id.homeButton);
        submitButton = findViewById(R.id.submitButton);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Q4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void submitAnswer (View view) {

        if(correctAnswer.isChecked() & correctAnswer2.isChecked()){
            userPoints = userPoints + 2;
        }
        else if(correctAnswer.isChecked()) {
            userPoints = userPoints + 1;
        }
        else if(correctAnswer2.isChecked()){
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

        Intent intent = new Intent (Q4.this, MainActivity.class);
        startActivity(intent);

    }
}
