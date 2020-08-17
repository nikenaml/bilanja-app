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
import com.example.bilanjaapp.DetailExploreVideoActivity;
import com.example.bilanjaapp.R;
import com.example.bilanjaapp.model.ExploreVideo;

import java.util.ArrayList;

public class ListExploreVideoAdapter extends RecyclerView.Adapter<ListExploreVideoAdapter.ListViewHolder> {
    private ArrayList<ExploreVideo> listExploreVideo;
    Context c;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListExploreVideoAdapter(ArrayList<ExploreVideo> list, Context c) {
        this.listExploreVideo = list;
        this.c=c;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_explore_video, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        ExploreVideo explore = listExploreVideo.get(position);

        final String nama=explore.getNama();
        final String asal=explore.getAsal();
        final String isi=explore.getIsi();
        final String photo= explore.getPhoto();

        Glide.with(holder.itemView.getContext())
                .load(explore.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvNama.setText(explore.getNama());
        holder.tvAsal.setText(explore.getAsal());
        holder.tvIsi.setText(explore.getIsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listExploreVideo.get(holder.getAdapterPosition()));
                openDetail(nama,asal,isi,photo);}
        });
    }

    private void openDetail(String... details) {
        Intent i = new Intent(c, DetailExploreVideoActivity.class);
        i.putExtra("NAMA_KEY", details[0]);
        i.putExtra("ASAL_KEY", details[1]);
        i.putExtra("ISI_KEY", details[2]);
        i.putExtra("IMAGE_KEY", details[3]);
        c.startActivity(i);
    }

    public interface OnItemClickCallback {
        void onItemClicked(ExploreVideo data);
    }

    @Override
    public int getItemCount() {
        return listExploreVideo.size();
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

    public void updateList(ArrayList<ExploreVideo> list){
        listExploreVideo = new ArrayList<>();
        listExploreVideo.addAll(list);
        notifyDataSetChanged();
    }
}
