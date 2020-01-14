package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodTalksThree extends AppCompatActivity {

    Button btnBackFoodTalks3, btnBackToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_talks_three);

        btnBackFoodTalks3 = (Button) findViewById(R.id.btn_BackToFood3);
        btnBackFoodTalks3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksThree.this, FoodTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodTalksThree.this, FoodChosen.class);
                startActivity(intent);

            }
        });
    }
}
