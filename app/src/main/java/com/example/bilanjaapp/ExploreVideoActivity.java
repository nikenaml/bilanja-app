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
import com.example.bilanjaapp.adapter.ListExploreVideoAdapter;
import com.example.bilanjaapp.model.ExploreVideo;
import com.example.bilanjaapp.model.ExploreVideoData;

import java.util.ArrayList;

public class ExploreVideoActivity extends AppCompatActivity {
    SearchView searchView;
    private RecyclerView rvExploreVideo;
    private ArrayList<ExploreVideo> list = new ArrayList<>();
    ListExploreVideoAdapter adapter;//adapter di activity ini

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explore_video);

        rvExploreVideo = findViewById(R.id.rv_explore_video);
        rvExploreVideo.setHasFixedSize(true);

        list.addAll(ExploreVideoData.getListData());
        showRecyclerList();

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Explore Video BIlanja Sign");
        }
        adapter=new ListExploreVideoAdapter(list,ExploreVideoActivity.this);
    }

    private void showRecyclerList() {
        rvExploreVideo.setLayoutManager(new LinearLayoutManager(this));
        ListExploreVideoAdapter listExploreVideoAdapter = new ListExploreVideoAdapter(list, this);
        rvExploreVideo.setAdapter(listExploreVideoAdapter);//adapter di recycler viewnya
        listExploreVideoAdapter.setOnItemClickCallback(new ListExploreVideoAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ExploreVideo data) {
                showSelectedExplore(data);
            }
        });
    }

    private void showSelectedExplore(ExploreVideo explore) {
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
                final ArrayList<ExploreVideo> filtermodelist = filter(list,newText);
                //salah akses adapter, kalo mau update recycler, adapter yang diakses itu harus dari adapter si recycler view nya
                //error gara gara belum tambah data disini
                ListExploreVideoAdapter adapter = (ListExploreVideoAdapter) rvExploreVideo.getAdapter();
                adapter.updateList(filtermodelist);
                return true;
            }
        });
        return true;
    }

    private ArrayList<ExploreVideo> filter(ArrayList<ExploreVideo> pl, String query){
        query = query.toLowerCase();
        final ArrayList<ExploreVideo> filteredModeList = new ArrayList<>();

        for (ExploreVideo model : pl){
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
