package com.example.intentpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    //step 1: create global variables
    private TextView secondLBL;
    private Button second;
    private EditText secondInformation;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //THIS SETS THE LAYOUT THIS JAVA FILE SHOULD SEE

        //step 2: connect the java obj with the widgets
        second = findViewById(R.id.secondBTN);
        secondInformation = findViewById(R.id.secondUI);
        secondLBL = findViewById(R.id.secondLBL);
        String dataFromPageOne = getIntent().getStringExtra("user input");
        secondLBL.setText(dataFromPageOne);

        second.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //step 3: set up your intent
                //IntentCLass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent j = new Intent(SecondActivity.this,ThirdActivity.class);
                j.putExtra("second user input",String.valueOf(secondInformation.getText())+" "+dataFromPageOne);

                //step 4: go to your new activity
                startActivity(j);
            }
        });
    }
}
