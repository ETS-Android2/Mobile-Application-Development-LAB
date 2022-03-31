package com.example.bundleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras(); // getintent().getextras vech ivdem bundle create cheyya
        String value = b.getString("key");  // key vech value get cheyya
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show(); // kittya value ne toast cheythu
    }
}
