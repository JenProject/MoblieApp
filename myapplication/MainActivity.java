package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnChooseTransport, btnChooseBoarding, btnChooseFood, btnChooseMedicine, btnChooseShopping, btnChooseSightsee ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChooseTransport = (ImageButton) findViewById(R.id.btn_ChooseTransport);
        btnChooseBoarding = (ImageButton) findViewById(R.id.btn_ChooseBoarding);
        btnChooseFood = (ImageButton) findViewById(R.id.btn_ChooseFood);
        btnChooseMedicine = (ImageButton) findViewById(R.id.btn_ChooseMedicine);
        btnChooseShopping = (ImageButton) findViewById(R.id.btn_ChooseShopping);
        btnChooseSightsee = (ImageButton) findViewById(R.id.btn_ChooseSightsee);

        btnChooseTransport.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, CategoryChosen1.class);
                startActivity(intent);

            }
        });

        btnChooseBoarding.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, BoardingChosen.class);
                startActivity(intent);

            }
        });

        btnChooseFood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FoodChosen.class);
                startActivity(intent);

            }
        });

        btnChooseMedicine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MedicChosen.class);
                startActivity(intent);

            }
        });

        btnChooseShopping.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ShoppingChosen.class);
                startActivity(intent);

            }
        });

        btnChooseSightsee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SightseeChosen.class);
                startActivity(intent);

            }
        });


        }


    }

