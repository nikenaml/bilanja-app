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

import com.example.bilanjaapp.adapter.ListExploreGambarAdapter;
import com.example.bilanjaapp.model.ExploreGambar;
import com.example.bilanjaapp.model.ExploreGambarData;

import java.util.ArrayList;

public class ExploreGambarActivity extends AppCompatActivity {
    SearchView searchView;
    private RecyclerView rvExploreGambar;
    private ArrayList<ExploreGambar> list = new ArrayList<>();
    ListExploreGambarAdapter adapter;//adapter di activity ini

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore_gambar);

        rvExploreGambar = findViewById(R.id.rv_explore_gambar);
        rvExploreGambar.setHasFixedSize(true);

        list.addAll(ExploreGambarData.getListData());
        showRecyclerList();

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Kamus Gambar BIlanja Sign");
        }
        adapter=new ListExploreGambarAdapter(list,ExploreGambarActivity.this);
    }

    private void showRecyclerList() {
        rvExploreGambar.setLayoutManager(new LinearLayoutManager(this));
        ListExploreGambarAdapter listExploreAdapter = new ListExploreGambarAdapter(list, this);
        rvExploreGambar.setAdapter(listExploreAdapter);//adapter di recycler viewnya
        listExploreAdapter.setOnItemClickCallback(new ListExploreGambarAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ExploreGambar data) {
                showSelectedExplore(data);
            }
        });
    }

    private void showSelectedExplore(ExploreGambar explore) {
        Toast.makeText(this, "Anda memilih " + explore.getNama(), Toast.LENGTH_SHORT).show();
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
                final ArrayList<ExploreGambar> filtermodelist = filter(list,newText);
                //salah akses adapter, kalo mau update recycler, adapter yang diakses itu harus dari adapter si recycler view nya
                //error gara gara belum tambah data disini
                ListExploreGambarAdapter adapter = (ListExploreGambarAdapter) rvExploreGambar.getAdapter();
                adapter.updateList(filtermodelist);
                return true;
            }
        });
        return true;
    }

    private ArrayList<ExploreGambar> filter(ArrayList<ExploreGambar> pl, String query){
        query = query.toLowerCase();
        final ArrayList<ExploreGambar> filteredModeList = new ArrayList<>();

        for (ExploreGambar model : pl){
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
