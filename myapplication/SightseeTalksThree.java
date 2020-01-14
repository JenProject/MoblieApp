package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SightseeTalksThree extends AppCompatActivity {

    Button btnBackToSightsee3, btnBackToMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightsee_talks_three);

        btnBackToSightsee3 = (Button) findViewById(R.id.btn_BackToSightsee3);
        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);

        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksThree.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnBackToSightsee3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksThree.this, SightseeTalksThree.class);
                startActivity(intent);

            }
        });
    }
}
