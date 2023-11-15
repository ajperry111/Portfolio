import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adventuregame.R;
import com.example.adventuregame.Station;

public class FridgePage extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge_page);
        back=findViewById(R.id.stationBTN);
        back.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(FridgePage.this, Station.class);
                startActivity(i);
            }
        });
    }}