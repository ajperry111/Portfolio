package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button instructions;
    private Button playGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instructions=findViewById(R.id.instructionBTN);
        playGame=findViewById(R.id.playGameBTN);



    instructions.setOnClickListener( new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent i = new Intent(MainActivity.this,InstructionsPage.class);
            startActivity(i);
        }
    });
        playGame.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Station.class);
                startActivity(i);
            }
        });
}}