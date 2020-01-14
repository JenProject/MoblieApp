package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardingTalksTwo extends AppCompatActivity {

    Button btnNextBoardingTalks2, btnBackToBoarding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_talks_two);

        btnNextBoardingTalks2 = (Button) findViewById(R.id.btn_NextBoardingTalks2);
        btnNextBoardingTalks2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksTwo.this,BoardingTalksThree.class);
                startActivity(intent);

            }
        });

        btnBackToBoarding2 = (Button) findViewById(R.id.btn_BackToBoarding2);
        btnBackToBoarding2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksTwo.this, BoardingTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
