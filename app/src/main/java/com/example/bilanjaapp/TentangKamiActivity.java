package com.example.bilanjaapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bilanjaapp.adapter.ListTentangKamiAdapter;
import com.example.bilanjaapp.model.TentangKami;

import java.util.ArrayList;
import java.util.List;

public class TentangKamiActivity extends AppCompatActivity {
    SearchView searchView;
    private RecyclerView rvTentangKami;
    private ArrayList<TentangKami> list = new ArrayList<>();
    ListTentangKamiAdapter adapter;//adapter di activity ini

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_kami);

        rvTentangKami = findViewById(R.id.rv_tentang_kami);
        rvTentangKami.setHasFixedSize(true);

        setData();
        showRecyclerList();

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Daftar Anggota Kelompok");
        }
        adapter=new ListTentangKamiAdapter(list,TentangKamiActivity.this);
    }

    private void setData() {
        TentangKami dataAnnisa = new TentangKami("Annisa Rizki", "Teknik Informatika 2017 - Universitas Mercu Buana", "41517010006 \nannisarizkililiandari@gmail.com \n\nJob Desk : Manajer Proyek", "https://1.bp.blogspot.com/-lVYnVd_C8IU/XfXPUpYD7nI/AAAAAAAATV4/_7CJA_MzEhUwN59_b-zy0guRSEr41cXeACLcBGAsYHQ/s320/lia.jpeg");
        TentangKami dataShelvi = new TentangKami("Shelviyanah", "Teknik Informatika 2017 - Universitas Mercu Buana", "41517010008 \nyanahshelvistore@gmail.com \n\nJob Desk : Administrator Proyek", "https://1.bp.blogspot.com/-uyDvimVR9H8/XfXQU5QKloI/AAAAAAAATWI/G2LtulKoKNM8ErJ2La9gFQjg-r4U1678wCLcBGAsYHQ/s320/shelvi.jpeg");
        TentangKami dataFebriana = new TentangKami("Febriana Kusumah", "Teknik Informatika 2017 - Universitas Mercu Buana", "41517010039 \nanonim@gmail.com \n\nJob Desk : System Analyst & Database Administrator", "https://1.bp.blogspot.com/-uEVZRT_IBNw/XfXQU56e6uI/AAAAAAAATWE/QHjEE8LVRScVQD-1a1afQVrb7n-GCKnBgCLcBGAsYHQ/s320/febri.jpeg");
        TentangKami dataNiken = new TentangKami("Niken Amelia", "Teknik Informatika 2017 - Universitas Mercu Buana", "41517010054 \nnikenkenaml@gmail.com \n\nJob Desk : Full Stack Developer", "https://1.bp.blogspot.com/-wk5JJptKp_8/XfXSJHHe2uI/AAAAAAAATWY/vQ1J9jx3wTQikuf3Rw6CDn2cr1XufHIbQCLcBGAsYHQ/s320/niken.jpeg");

        list.add(dataAnnisa);
        list.add(dataShelvi);
        list.add(dataFebriana);
        list.add(dataNiken);
    }

    private void showRecyclerList() {
        rvTentangKami.setLayoutManager(new LinearLayoutManager(this));
        ListTentangKamiAdapter listExploreAdapter = new ListTentangKamiAdapter(list, this);
        rvTentangKami.setAdapter(listExploreAdapter);//adapter di recycler viewnya
        listExploreAdapter.setOnItemClickCallback(new ListTentangKamiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(TentangKami data) {
                showSelectedTentang(data);
            }
        });
    }

    private void showSelectedTentang(TentangKami tentang) {
        Toast.makeText(this, "Anda memilih " + tentang.getNama(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_search, menu);

        final MenuItem menuItem = menu.findItem(R.id.search);
        searchView = (SearchView) menuItem.getActionView();
//        searchView.setOnQueryTextListener(this);
//        return true;
        changeSearchViewTextColor(searchView);
        ((EditText) searchView.findViewById(androidx.appcompat.R.id.search_src_text)).setHintTextColor(getResources().getColor(R.color.white));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(!searchView.isIconified()){
                    searchView.setIconified(true);
                }

                menuItem.collapseActionView();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                final ArrayList<TentangKami> filtermodelist = filter(list,newText);
                //salah akses adapter, kalo mau update recycler, adapter yang diakses itu harus dari adapter si recycler view nya
                //error gara gara belum tambah data disini
                ListTentangKamiAdapter adapter = (ListTentangKamiAdapter) rvTentangKami.getAdapter();
                adapter.updateList(filtermodelist);
                return true;
            }
        });
        return true;
    }

    private ArrayList<TentangKami> filter(ArrayList<TentangKami> pl, String query){
        query = query.toLowerCase();
        final ArrayList<TentangKami> filteredModeList = new ArrayList<>();

        for (TentangKami model : pl){
            final String text=model.getNama().toLowerCase();
            if (text.startsWith(query)){
                filteredModeList.add(model);
            }
        }
        return filteredModeList;
    }

    private void changeSearchViewTextColor (View view) {
        if (view != null){
            if (view instanceof TextView){
                ((TextView) view).setTextColor(Color.WHITE);
                return;
            }
            else if (view instanceof ViewGroup){
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount();i++){
                    changeSearchViewTextColor(viewGroup.getChildAt(i));
                }
            }
        }
    }
}
