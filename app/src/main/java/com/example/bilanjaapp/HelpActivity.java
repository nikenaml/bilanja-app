package com.example.bilanjaapp;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Tata Cara Penggunaan Aplikasi");
        }
    }
}
