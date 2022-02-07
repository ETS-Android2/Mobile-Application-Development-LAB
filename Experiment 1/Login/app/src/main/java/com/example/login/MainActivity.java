package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView ue;
    private TextView pe;
    private int counter = 5;
    private String Admin="Admin";
    private  String Pass="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogin);
        ue=(TextView)findViewById(R.id.unameerror);
        pe=(TextView)findViewById(R.id.passerror);
        ue.setVisibility(View.INVISIBLE);
        pe.setVisibility(View.INVISIBLE);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());

            }
        });
    }
    private void validate(String userName, String userPassword){
        if (userName.equals("")){
            ue.setVisibility(View.VISIBLE);

        }
        if (userPassword.equals("")){
            pe.setVisibility(View.VISIBLE);
        }

       if((userName.equals(Admin)) && (userPassword.equals(Pass))){

            Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Invalid username and password",Toast.LENGTH_LONG).show();
            counter --;
            if(counter==0){
                Login.setEnabled(false);
            }
        }
    }

}
