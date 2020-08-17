package com.example.bilanjaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailExploreVideoActivity extends AppCompatActivity {
    VideoView vid;
    Button btn_play;
    MediaController mediaController;
    TextView nama_text, asal_text, isi_text;
    ImageView img_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_explore_video_activity);

        vid = findViewById(R.id.video);
        btn_play = findViewById(R.id.play);
        mediaController = new MediaController(this);

        nama_text = findViewById(R.id.tv_item_nama);
        asal_text = findViewById(R.id.tv_item_asal);
        isi_text = findViewById(R.id.tv_item_isi);

        Intent i = this.getIntent();
        String nama = i.getExtras().getString("NAMA_KEY");
        String asal = i.getExtras().getString("ASAL_KEY");
        String isi = i.getExtras().getString("ISI_KEY");

        nama_text.setText(nama);
        asal_text.setText(asal);
        isi_text.setText(isi);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Penjelasan Video Sign Explore");
        }
    }

    public void VideoPlay (View view){
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.vid1);
        vid.setVideoURI(uri);
        vid.setMediaController(mediaController);
        mediaController.setAnchorView(vid);
        vid.start();
    }
}
