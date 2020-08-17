package com.example.bilanjaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    //deklarasi tombol
    private Button Btn_explore_gambar, Btn_explore_video, Btn_tentang_aplikasi, Btn_tentang_kami;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        //inisial tombol
        Btn_explore_gambar = (Button) findViewById(R.id.button_explore_gambar);
        Btn_explore_video = (Button) findViewById(R.id.button_explore_video);
        Btn_tentang_aplikasi = (Button) findViewById(R.id.button_tentang_aplikasi);
        Btn_tentang_kami = (Button) findViewById(R.id.button_tentang_kami);
//        Btn_kamus = (Button)findViewById(R.id.button_kamus);

//        Button buttonExplore = findViewById(R.id.button_explore);
//        buttonExplore.setOnClickListener(this);
//
//        Button buttonKamus = findViewById(R.id.button_kamus);
//        buttonKamus.setOnClickListener(this);
//
//        Button buttonBIsyarat = findViewById(R.id.button_bisyarat);
//        buttonBIsyarat.setOnClickListener(this);

        // function tombol
        Btn_explore_gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iExplore = new Intent(getApplicationContext(), ExploreGambarActivity.class);
                startActivity(iExplore);
            }
        });

        Btn_explore_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iExplore = new Intent(getApplicationContext(), ExploreVideoActivity.class);
                startActivity(iExplore);
            }
        });

        Btn_tentang_aplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iExplore = new Intent(getApplicationContext(), TentangAplikasiActivity.class);
                startActivity(iExplore);
            }
        });

        Btn_tentang_kami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iExplore = new Intent(getApplicationContext(), TentangKamiActivity.class);
                startActivity(iExplore);
            }
        });

//        Btn_kamus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent iKamus = new Intent(getApplicationContext(), ExploreActivity.class);
//                startActivity(iKamus);
//            }
//        });
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_help, menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            setMode(item.getItemId());
            return super.onOptionsItemSelected(item);
        }

        public void setMode (int selectedMode){
            switch (selectedMode){
                case R.id.help_action:
                    gotoHelp();
                    break;
            }
        }

        private void gotoHelp(){
            Intent moveIntent = new Intent(DashboardActivity.this, HelpActivity.class);
            startActivity(moveIntent);
        }
}
