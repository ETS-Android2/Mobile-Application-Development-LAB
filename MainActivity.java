package com.example.bundleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                Bundle b = new Bundle(); // bundle create cheyya
                b.putString("key"," pass cheyan ulla value / varible"); // bundlek putstring vech value add cheyya key value pair ayit
                i.putExtras(b); // create cheytha bundle ne intent lek add cheyya putExtra vech
                startActivity(i); // intent start cheyya
            }
        });
    }
}
