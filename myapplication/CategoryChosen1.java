package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CategoryChosen1 extends AppCompatActivity {

    ImageButton btnBackToMenu;
    Button btnTransportTalks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_chosen1);

        String Message = "TRANSPORT";
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        btnBackToMenu = (ImageButton) findViewById(R.id.btn_BackToMenu);
        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(CategoryChosen1.this, MainActivity.class);
                startActivity(intent);


            }
        });

        btnTransportTalks = (Button) findViewById(R.id.btn_TransportTalks);
        btnTransportTalks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryChosen1.this, TransportTalks.class);
                startActivity(intent);
            }
        });
    }


}

