package com.example.lifecyclenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button first;
    private EditText firstInformation;
    private void showLog(String text){
        Log.d("LifeCycle Example",text);
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLog("onCreate Fired");
        //Log.d -> debug
        //Log.e -> error
        //Log.i -> info
        //step 2: connect the java obj with the widgets
        first = findViewById(R.id.firstBTN);
        firstInformation = findViewById(R.id.firstUI);



        first.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //step 3: set up your intent
                //IntentCLass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                //step 4: this is for implicit or passing data
                i.putExtra("user input",String.valueOf(firstInformation.getText()));


                //step 5: go to your new activity
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("onStart Fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("onResume Fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("onPause Fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("onRestart Fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("onStop Fired");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("onDestroy Fired");
    }

}