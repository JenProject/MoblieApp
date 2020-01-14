package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingTalksOne extends AppCompatActivity {

    Button btnBackToShopping1, btnNextShoppingTalks1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_talks_one);



        btnBackToShopping1 = (Button) findViewById(R.id.btn_BackToShopping1);
        btnBackToShopping1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksOne.this, ShoppingChosen.class);
                startActivity(intent);

            }
        });

        btnNextShoppingTalks1 = (Button) findViewById(R.id.btn_NextShoppingTalk1);
        btnNextShoppingTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksOne.this, ShoppingTalksTwo.class);
                startActivity(intent);

            }
        });
    }
}
