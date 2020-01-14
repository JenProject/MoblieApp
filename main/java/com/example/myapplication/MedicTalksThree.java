package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicTalksThree extends AppCompatActivity {

    Button btnBackToMenu, btnBackToMedic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic_talks_three);

        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicTalksThree.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnBackToMedic3 = (Button) findViewById(R.id.btn_BackToMedic3);
        btnBackToMedic3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicTalksThree.this, MedicTalksTwo.class);
                startActivity(intent);

            }
        });
    }
}
