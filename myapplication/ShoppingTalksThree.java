package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingTalksThree extends AppCompatActivity {

    Button btnBackToShopping3, btnBackToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_talks_three);

        btnBackToShopping3 = (Button) findViewById(R.id.btn_BackToShopping3);
        btnBackToShopping3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksThree.this, ShoppingTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingTalksThree.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
