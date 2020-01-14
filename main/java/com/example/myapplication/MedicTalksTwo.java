package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicTalksTwo extends AppCompatActivity {
    Button btnNextMedicTalks2, btnBackToMedic2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic_talks_two);

        btnNextMedicTalks2 = (Button) findViewById(R.id.btn_NextMedicTalk2);
        btnNextMedicTalks2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(MedicTalksTwo.this, MedicTalksThree.class);
                    startActivity(intent);

                }
            });

        btnBackToMedic2 = (Button) findViewById(R.id.btn_BackToMedic2);
        btnBackToMedic2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(MedicTalksTwo.this, MedicTalksOne.class);
                    startActivity(intent);

                }
            });
    }
}
