package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoardingTalksThree extends AppCompatActivity {

    Button btnBackToBoarding3, btnBackToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_talks_three);

        btnBackToBoarding3 = (Button) findViewById(R.id.btn_BackToBoarding3);
        btnBackToBoarding3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksThree.this, BoardingTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingTalksThree.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
