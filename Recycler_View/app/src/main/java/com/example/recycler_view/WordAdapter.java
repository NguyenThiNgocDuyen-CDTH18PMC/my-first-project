package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordHolder> {
    Context context;
    List<khuyenmai> danhsach;

    public WordAdapter(Context context, List<khuyenmai> danhsach) {
        this.context = context;
        this.danhsach = danhsach;
    }

    @NonNull
    @Override
    public WordHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater  mInflater= LayoutInflater.from(context);
        View view=mInflater.inflate(R.layout.worditem,parent,false);
        return new WordHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordHolder holder, int position) {
        holder.txtName.setText(danhsach.get(position).getName());
        holder.txtKm.setText(danhsach.get(position).getTrangthai());
        holder.imgButton.setImageResource(danhsach.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return danhsach.size();
    }

    public class WordHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtKm;
        ImageButton imgButton;
        public WordHolder(@NonNull View itemView) {
            super(itemView);
            txtName=(TextView)itemView.findViewById(R.id.name);
            txtKm=(TextView)itemView.findViewById(R.id.name);
            imgButton=(ImageButton)itemView.findViewById(R.id.images);
        }
    }
}
