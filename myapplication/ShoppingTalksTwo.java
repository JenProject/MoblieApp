package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingTalksTwo extends AppCompatActivity {

    Button btnBackToShopping2, btnNextShoppingTalks2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_talks_two);

        btnNextShoppingTalks2 = (Button) findViewById(R.id.btn_NextShoppingTalk2);
        btnNextShoppingTalks2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksTwo.this, ShoppingTalksThree.class);
                startActivity(intent);

            }
        });

        btnBackToShopping2 = (Button) findViewById(R.id.btn_BackToShopping2);
        btnBackToShopping2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksTwo.this, ShoppingTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
