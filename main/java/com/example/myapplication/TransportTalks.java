package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportTalks extends AppCompatActivity {

    Button btnBackToTransport1, btnNextTransportTalks1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_talks);

        btnBackToTransport1 = (Button) findViewById(R.id.btn_BackToTransport1);
        btnNextTransportTalks1 = (Button) findViewById(R.id.btn_NextTransportTalk1);

        btnBackToTransport1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalks.this, CategoryChosen1.class);
                startActivity(intent);

            }
        });

        btnNextTransportTalks1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalks.this, TransportTalksPartTwo.class);
                startActivity(intent);

            }
        });
    }
}
