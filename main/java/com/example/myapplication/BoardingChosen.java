package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BoardingChosen extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnBoardingTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_chosen);

        String Message = "BOARDING";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingChosen.this, MainActivity.class);
                startActivity(intent);

            }
        });
        btnBoardingTalks = (Button) findViewById(R.id.btn_BoardingTalks);
        btnBoardingTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(BoardingChosen.this, BoardingTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
