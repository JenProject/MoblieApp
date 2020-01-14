package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FoodChosen extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnFoodTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_chosen);

        String Message = "FOOD";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodChosen.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnFoodTalks = (Button) findViewById(R.id.btn_FoodTalks);
        btnFoodTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FoodChosen.this, FoodTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
