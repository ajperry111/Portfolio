package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect a java object to the widget
        EditText firstETXT = findViewById(R.id.firstEditText);
        EditText lastETXT = findViewById(R.id.lastNameEditText);
        EditText cityETXT = findViewById(R.id.cityEditText);
        EditText schoolETXT = findViewById(R.id.schoolEditText);
        EditText petETXT = findViewById(R.id.petNameEditText);
        EditText siblingETXT = findViewById(R.id.siblingNameEditText);
        Button generateBTN = findViewById(R.id.generateButton);
        TextView outputTXT = findViewById(R.id.outputTextView);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randy = new Random();
                String first = String.valueOf(firstETXT.getText());
                String last = String.valueOf(lastETXT.getText());
                String city = String.valueOf(cityETXT.getText());
                String school = String.valueOf(schoolETXT.getText());
                String pet = String.valueOf(petETXT.getText());
                String sibling = String.valueOf(siblingETXT.getText());

                int firstPortion = randy.nextInt(first.length());
                int lastPortion = randy.nextInt(last.length());
                String scifiFirst = first.substring(0,firstPortion)+last.substring(0,lastPortion);
                firstPortion = randy.nextInt(city.length());
                lastPortion = randy.nextInt(school.length());
                String scifiLast = city.substring(0,firstPortion)+school.substring(0,lastPortion);
                firstPortion = randy.nextInt(pet.length());
                lastPortion = randy.nextInt(sibling.length());
                String scifiOrigin = pet.substring(0,firstPortion)+sibling.substring(0,lastPortion);
                //scifiFirst = first.substring(0,randy.nextInt(first.length()))+last.substring(0,randy.nextInt(last.length()));
                outputTXT.setText(scifiFirst+""+scifiLast+" of the planet "+scifiOrigin);
            }
        });


    }

    }
