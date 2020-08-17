package com.example.bilanjaapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class TentangAplikasiActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_aplikasi);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Tentang BIlanja Sign App");
        }
    }
}
