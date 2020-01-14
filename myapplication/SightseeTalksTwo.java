package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SightseeTalksTwo extends AppCompatActivity {

    Button btnBackToSightsee2, btnNextSighseetalks2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightsee_talks_two);

        btnBackToSightsee2 = (Button) findViewById(R.id.btn_BackToSightsee2);
        btnNextSighseetalks2 = (Button) findViewById(R.id.btn_NextSightseeTalk2);

        btnBackToSightsee2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksTwo.this, SightseeTalksOne.class);
                startActivity(intent);

            }
        });

        btnNextSighseetalks2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeTalksTwo.this, SightseeTalksThree.class);
                startActivity(intent);

            }
        });
    }
}
