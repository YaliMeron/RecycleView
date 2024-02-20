package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {

    Context context;
    ArrayList<CardModel> models;

    public CardAdapter(Context context, ArrayList<CardModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout, viewGroup);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.MyViewHolder MyViewHolder, int position) {
        MyViewHolder.text.setText(models.get(position).text);
        MyViewHolder.iv.setImageResource(models.get(position).image);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    static public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //this is like the OnCreate
            text = itemView.findViewById(R.id.textView2);
            iv = itemView.findViewById(R.id.imageView2);
        }
    }
}
