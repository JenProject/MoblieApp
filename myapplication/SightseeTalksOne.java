package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SightseeTalksOne extends AppCompatActivity {

    Button btnBackToSightsee1, btnNextSighteeTalks1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightsee_talks_one);

        btnBackToSightsee1 = (Button) findViewById(R.id.btn_BackToSightsee1);
        btnNextSighteeTalks1 = (Button) findViewById(R.id.btn_NextSightseeTalk1);

        btnBackToSightsee1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksOne.this, SightseeChosen.class);
                startActivity(intent);

            }
        });

        btnNextSighteeTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksOne.this, SightseeTalksTwo.class);
                startActivity(intent);

            }
        });
    }
}
