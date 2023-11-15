package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OvenPage extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oven_page);
        back=findViewById(R.id.stationBTN);
        back.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(OvenPage.this,Station.class);
                startActivity(i);
            }
        });
    }}
