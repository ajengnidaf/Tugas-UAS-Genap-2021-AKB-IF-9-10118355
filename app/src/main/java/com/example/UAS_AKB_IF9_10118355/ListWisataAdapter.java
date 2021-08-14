package com.example.UAS_AKB_IF9_10118355;

// 08 Agustus 2021 - 10118355 - Siti Alawiah - IF 9

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder> {

    private ArrayList<Wisata> listWisata;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback=onItemClickCallback;
    }

    public ListWisataAdapter(ArrayList<Wisata> list) {
        this.listWisata=list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wisata, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Wisata wisata = listWisata.get(position);
        holder.tvNames.setText(wisata.getName());
        holder.tvDescription.setText(wisata.getDescription());
        Glide.with(holder.itemView.getContext())
                .load(wisata.getPhoto())
                .apply(new RequestOptions().override(70,70))
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listWisata.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNames, tvDescription;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.img_item_photo);
            tvNames=itemView.findViewById(R.id.tv_wisata_name);
            tvDescription=itemView.findViewById(R.id.tv_wisata_description);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Wisata data);
    }
}

