package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginOrRegister extends AppCompatActivity {
    Intent GoToLogin,GoToRegister;
    Button loginbtn,registerbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
        loginbtn = findViewById(R.id.loginactivity_login);
        registerbtn = findViewById(R.id.btn_register);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToLogin = new Intent(getBaseContext(), login.class);
                startActivity(GoToLogin);
            }
        });
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToRegister = new Intent(getBaseContext(), Register.class);
                startActivity(GoToRegister);
            }
        });
    }
}