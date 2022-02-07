package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    Button plus,min,mul,div;
    EditText edt1,edt2;
    TextView txt;
    float num1,num2,rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.button);
        min = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        edt1 = findViewById(R.id.editText);
        edt2 = findViewById(R.id.editText2);
        txt = findViewById(R.id.textView);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edt1.getText().toString());
                num2 = Float.parseFloat(edt2.getText().toString());
                rslt=num1+num2;
                txt.setText(String.valueOf(rslt));

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edt1.getText().toString());
                num2 = Float.parseFloat(edt2.getText().toString());
                rslt=num1-num2;
                txt.setText(String.valueOf(rslt));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edt1.getText().toString());
                num2 = Float.parseFloat(edt2.getText().toString());
                rslt=num1/num2;
                txt.setText(String.valueOf(rslt));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edt1.getText().toString());
                num2 = Float.parseFloat(edt2.getText().toString());
                rslt=num1*num2;
                txt.setText(String.valueOf(rslt));
            }
        });
    }






    }

