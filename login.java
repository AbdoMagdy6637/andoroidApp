package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText etusernamelogin , etpasswordlogin;
    Button loginactivitybtn;
    Intent GoToMainActovityFromLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etusernamelogin = findViewById(R.id.usernamelogin);
        etpasswordlogin = findViewById(R.id.passwordlogin);
        loginactivitybtn = findViewById(R.id.loginactivity_login);
        loginactivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etusernamelogin.getText().toString().isEmpty())
                    Toast.makeText(getBaseContext(),"Enter User Name",Toast.LENGTH_LONG).show();
                else if (etpasswordlogin.getText().toString().isEmpty())
                    Toast.makeText(getBaseContext(),"Enter Your Password",Toast.LENGTH_LONG).show();
                else
                {
                    GoToMainActovityFromLogin = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(GoToMainActovityFromLogin);
                }
            }
        });
    }
}