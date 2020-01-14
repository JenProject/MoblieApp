package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SightseeChosen extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnSightseetTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightsee_chosen);

        String Message = "SIGHTSEE";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeChosen.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnSightseetTalks = (Button) findViewById(R.id.btn_SightseeTalks);
        btnSightseetTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SightseeChosen.this, SightseeTalksOne.class);
                startActivity(intent);

            }
        });
    }
}
