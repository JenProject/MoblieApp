package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ShoppingChosen extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnShoppingTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_chosen);

        String Message = "SHOPPING";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingChosen.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnShoppingTalks = (Button) findViewById(R.id.btn_ShoppingTalks);
        btnShoppingTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ShoppingChosen.this, ShoppingTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
