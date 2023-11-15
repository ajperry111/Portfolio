package com.example.adventuregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Station extends AppCompatActivity {
    public void fridge(View view) {
        Intent i = new Intent(Station.this,FridgePage.class);
        startActivity(i);
    }
    public void pantry(View view) {
        Intent i = new Intent(Station.this,PantryPage.class);
        startActivity(i);
    }
    public void oven(View view) {
        Intent i = new Intent(Station.this,OvenPage.class);
        startActivity(i);
    }
    public void store(View view) {
        Intent i = new Intent(Station.this,StorePage.class);
        startActivity(i);
    }
    public void recipe(View view) {
        Intent i = new Intent(Station.this,RecipePage.class);
        startActivity(i);
    }
    public void money(View view) {
        Intent i = new Intent(Station.this,MoneyPage.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);
    }
}