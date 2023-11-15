package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionsPage extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions_page);
        back=findViewById(R.id.homepageBTN);
        back.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(InstructionsPage.this,MainActivity.class);
                startActivity(i);
            }
        });
    }}