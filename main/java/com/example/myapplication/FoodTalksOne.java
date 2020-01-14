package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodTalksOne extends AppCompatActivity {
    Button btnNextFoodTalks1, btnBackToFood1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_talks_one);

        btnNextFoodTalks1 = (Button) findViewById(R.id.btn_NextFoodTalk1);
        btnNextFoodTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksOne.this, FoodTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToFood1 = (Button) findViewById(R.id.btn_BackToFood1);
        btnBackToFood1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksOne.this, FoodChosen.class);
                startActivity(intent);

            }
        });
    }
}
