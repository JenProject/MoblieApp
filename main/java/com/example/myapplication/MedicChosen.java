package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MedicChosen extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnMedicTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic_chosen);

        String Message = "MEDIC";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicChosen.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnMedicTalks = (Button) findViewById(R.id.btn_MedicTalks);
        btnMedicTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MedicChosen.this, MedicTalksOne.class);
                startActivity(intent);

            }
        });

    }
}
