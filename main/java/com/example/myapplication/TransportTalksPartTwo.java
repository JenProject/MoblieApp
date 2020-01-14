package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportTalksPartTwo extends AppCompatActivity {


    Button btnBackToTransport2, btnNextTransportTalks2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_talks_part_two);

        btnBackToTransport2 = (Button) findViewById(R.id.btn_BackToTransport2);
        btnNextTransportTalks2 = (Button) findViewById(R.id.btn_NextTransportTalk2);

        btnBackToTransport2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalksPartTwo.this, TransportTalks.class);
                startActivity(intent);

            }
        });

        btnNextTransportTalks2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(TransportTalksPartTwo.this, TransportTalksThree.class);
                startActivity(intent);

            }
        });
    }
}
