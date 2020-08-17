package com.example.bilanjaapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.bilanjaapp.DetailExploreGambarActivity;
import com.example.bilanjaapp.R;
import com.example.bilanjaapp.model.ExploreGambar;

import java.util.ArrayList;

public class ListExploreGambarAdapter extends RecyclerView.Adapter<ListExploreGambarAdapter.ListViewHolder> {
    private ArrayList<ExploreGambar> listExploreGambar;
    Context c;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListExploreGambarAdapter(ArrayList<ExploreGambar> list, Context c) {
        this.listExploreGambar = list;
        this.c=c;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_explore_gambar, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        ExploreGambar exploreGambar = listExploreGambar.get(position);

        final String nama=exploreGambar.getNama();
        final String asal=exploreGambar.getAsal();
        final String isi=exploreGambar.getIsi();
        final String photo= exploreGambar.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(exploreGambar.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(exploreGambar.getNama());
        holder.tvAsal.setText(exploreGambar.getAsal());
        holder.tvIsi.setText(exploreGambar.getIsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listExploreGambar.get(holder.getAdapterPosition()));
                openDetail(nama,asal,isi,photo);}
        });
    }

    private void openDetail(String... details) {
        Intent i = new Intent(c, DetailExploreGambarActivity.class);
        i.putExtra("NAMA_KEY", details[0]);
        i.putExtra("ASAL_KEY", details[1]);
        i.putExtra("ISI_KEY", details[2]);
        i.putExtra("IMAGE_KEY", details[3]);
        c.startActivity(i);
    }

    public interface OnItemClickCallback {
        void onItemClicked(ExploreGambar data);
    }

    @Override
    public int getItemCount() {
        return listExploreGambar.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvNama, tvAsal, tvIsi;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvAsal = itemView.findViewById(R.id.tv_item_asal);
            tvIsi = itemView.findViewById(R.id.tv_item_isi);
        }
    }

    public void updateList(ArrayList<ExploreGambar> list){
        listExploreGambar = new ArrayList<>();
        listExploreGambar.addAll(list);
        notifyDataSetChanged();
    }
}
