package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardingTalksOne extends AppCompatActivity {

    Button btnNextBoardingTalks1, btnBackToBoarding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_talks_one);

        btnNextBoardingTalks1 = (Button) findViewById(R.id.btn_NextBoardingTalks1);
        btnNextBoardingTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksOne.this, BoardingTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToBoarding = (Button) findViewById(R.id.btn_BackToBoarding);
        btnBackToBoarding.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksOne.this, BoardingChosen.class);
                startActivity(intent);

            }
        });
    }
}
