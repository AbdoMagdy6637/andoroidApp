package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText etusername,etemail,etPassword,etConfirmPassword;
    Intent GoToMainActivityFromRegister;
    Button registeractivitybtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registeractivitybtn = findViewById(R.id.regirteractivity_register);
        etemail = findViewById(R.id.email);
        etusername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        etConfirmPassword = findViewById(R.id.confirm_password);
        registeractivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etusername.getText().toString().isEmpty())
                    Toast.makeText(getBaseContext(),"Enter User Name",Toast.LENGTH_LONG).show();
                else if (!etemail.getText().toString().contains("@") || !etemail.getText().toString().contains(".com") )
                    Toast.makeText(getBaseContext(),"Not Correct Email",Toast.LENGTH_LONG).show();
                else if (etemail.getText().toString().isEmpty())
                    Toast.makeText(getBaseContext(),"Enter Email",Toast.LENGTH_LONG).show();
                else if ( etPassword.getText().toString().isEmpty() || etConfirmPassword.getText().toString().isEmpty())
                    Toast.makeText(getBaseContext(),"Enter Your Password",Toast.LENGTH_LONG).show();
                else if(!etPassword.getText().toString().equals(etConfirmPassword.getText().toString())) {
                    Toast.makeText(getBaseContext(), "Re Enter Password", Toast.LENGTH_LONG).show();
                }
                else if (etPassword.getText().toString().equals(etConfirmPassword.getText().toString())){
                    GoToMainActivityFromRegister = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(GoToMainActivityFromRegister);
                }
            }
        });
    }
}