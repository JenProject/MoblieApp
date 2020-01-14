package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodTalksTwo extends AppCompatActivity {

    Button btnNextFoodTalks2, btnBackToFood2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_talks_two);

        btnNextFoodTalks2 = (Button) findViewById(R.id.btn_NextFoodTalk2);
        btnNextFoodTalks2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksTwo.this, FoodTalksThree.class);
                startActivity(intent);

            }
        });

        btnBackToFood2 = (Button) findViewById(R.id.btn_BackToFood2);
        btnBackToFood2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksTwo.this, FoodTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
