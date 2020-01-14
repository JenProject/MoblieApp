package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportTalksThree extends AppCompatActivity {

    Button btnBackToMenu, btnBackToTransport3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_talks_three);

        btnBackToTransport3 = (Button) findViewById(R.id.btn_BackToTransport3);
        btnBackToMenu = (Button) findViewById(R.id.btn_BackToMenu);

        btnBackToTransport3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalksThree.this, TransportTalksPartTwo.class);
                startActivity(intent);

            }
        });

        btnBackToMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalksThree.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
