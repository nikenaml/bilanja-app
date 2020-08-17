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
import com.example.bilanjaapp.DetailTentangKamiActivity;
import com.example.bilanjaapp.R;
import com.example.bilanjaapp.model.TentangKami;

import java.util.ArrayList;

public class ListTentangKamiAdapter extends RecyclerView.Adapter<ListTentangKamiAdapter.ListViewHolder> {
    private ArrayList<TentangKami> listTentangKami;
    Context c;

    private ListTentangKamiAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ListTentangKamiAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListTentangKamiAdapter(ArrayList<TentangKami> list, Context c) {
        this.listTentangKami = list;
        this.c=c;
    }

    @NonNull
    @Override
    public ListTentangKamiAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_tentang_kami, viewGroup, false);
        return new ListTentangKamiAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListTentangKamiAdapter.ListViewHolder holder, int position) {
        TentangKami tentangKami = listTentangKami.get(position);

        final String nama=tentangKami.getNama();
        final String asal=tentangKami.getAsal();
        final String isi=tentangKami.getIsi();
        final String photo= tentangKami.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(tentangKami.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(tentangKami.getNama());
        holder.tvAsal.setText(tentangKami.getAsal());
        holder.tvIsi.setText(tentangKami.getIsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listTentangKami.get(holder.getAdapterPosition()));
                openDetail(nama,asal,isi,photo);}
        });
    }

    private void openDetail(String... details) {
        Intent i = new Intent(c, DetailTentangKamiActivity.class);
        i.putExtra("NAMA_KEY", details[0]);
        i.putExtra("ASAL_KEY", details[1]);
        i.putExtra("ISI_KEY", details[2]);
        i.putExtra("IMAGE_KEY", details[3]);
        c.startActivity(i);
    }

    public interface OnItemClickCallback {
        void onItemClicked(TentangKami data);
    }

    @Override
    public int getItemCount() {
        return listTentangKami.size();
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

    public void updateList(ArrayList<TentangKami> list){
        listTentangKami = new ArrayList<>();
        listTentangKami.addAll(list);
        notifyDataSetChanged();
    }
}
