package com.example.mac.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginButton ;
    EditText emailEditText;
    EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText=(EditText)findViewById(R.id.emailET);
        passwordEditText=(EditText)findViewById(R.id.passwordET);
        loginButton=(Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailEditText==null){
                    Toast.makeText(getApplicationContext(),"please enter email",Toast.LENGTH_SHORT).show();
                }else if(passwordEditText==null){
                    Toast.makeText(getApplicationContext(),"please enter password",Toast.LENGTH_SHORT).show();

                }else{
                    Intent surveyIntent = new Intent(getApplicationContext(),NextClass.class);
                    startActivity(surveyIntent);
                }
            }
        });


    }

}
