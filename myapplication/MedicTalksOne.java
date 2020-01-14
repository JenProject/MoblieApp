package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MedicTalksOne extends AppCompatActivity {
    Button btnNextMedicTalks1, btnBackToMedic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic_talks_one);

        btnNextMedicTalks1 = (Button) findViewById(R.id.btn_NextMedicTalk1);
        btnNextMedicTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicTalksOne.this, MedicTalksTwo.class);
                startActivity(intent);

            }
        });

        btnBackToMedic1 = (Button) findViewById(R.id.btn_BackToMedic1);
        btnBackToMedic1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicTalksOne.this, MedicChosen.class);
                startActivity(intent);

            }
        });
    }
}
