package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_view_books;
    Intent GoToBookViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_view_books = findViewById(R.id.main_library);
        btn_view_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToBookViewer = new Intent(getBaseContext(), ViewBooks.class);
                startActivity(GoToBookViewer);
            }
        });
    }
}