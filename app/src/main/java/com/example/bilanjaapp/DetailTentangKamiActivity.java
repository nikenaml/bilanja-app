package com.example.bilanjaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailTentangKamiActivity extends AppCompatActivity {
    TextView nama_text, asal_text, isi_text;
    ImageView img_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_explore_gambar_activity);

        nama_text = findViewById(R.id.tv_item_nama);
        asal_text = findViewById(R.id.tv_item_asal);
        isi_text = findViewById(R.id.tv_item_isi);
        img_photo = findViewById(R.id.img_item_photo);

        Intent i = this.getIntent();
        String nama = i.getExtras().getString("NAMA_KEY");
        String asal = i.getExtras().getString("ASAL_KEY");
        String isi = i.getExtras().getString("ISI_KEY");
        String photo = i.getExtras().getString("IMAGE_KEY");

        nama_text.setText(nama);
        asal_text.setText(asal);
        isi_text.setText(isi);
        img_photo.setImageURI(Uri.parse(photo));

        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(100, 100))
                .into(img_photo);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Penjelasan Anggota");
        }
    }
}
