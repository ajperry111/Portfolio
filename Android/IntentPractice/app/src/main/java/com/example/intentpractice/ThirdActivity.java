package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    //step 1: create global variables
    private TextView thirdLBL;
    private Button third;
    private EditText thirdInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //step 2: connect the java obj with the widgets
        third = findViewById(R.id.thirdBTN);
        thirdInformation = findViewById(R.id.thirdUI);
        thirdLBL = findViewById(R.id.thirdLBL);
        thirdLBL.setText(getIntent().getStringExtra("second user input"));

        third.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //step 3: set up your intent
                //IntentCLass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent k = new Intent(ThirdActivity.this,MainActivity.class);

                //step 4: go to your new activity
                startActivity(k);
                //explicit intent -> navigating without data
                //startActivity(new Intent(MainActivity.this,SecondActivity.class)
            }
        });
    }
}