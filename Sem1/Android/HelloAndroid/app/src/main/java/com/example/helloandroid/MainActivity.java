package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//public for all files to access it
//class -> defining a class for the JVM
//MainActivity -> this is where your entire app starts... kind of
//extends AppCompatActivity -> DO NOT TOUCH... This is the library to connect the Java to XML
public class MainActivity extends AppCompatActivity {
    //This overrides the onCreate method in AppCompatActivity -> this runs on start up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}