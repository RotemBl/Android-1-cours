package com.example.recycleviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustumeAdapter extends RecyclerView.Adapter<CustumeAdapter.MyViewHolder> {
    ArrayList<DataModle> dataset;
    public CustumeAdapter(ArrayList<DataModle> dataSet) {
        this.dataset =dataSet;
    }
    public static class  MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewDescription;
         ImageView imageViewCharacter;

        public MyViewHolder(View itemView){
            super(itemView);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDescription = itemView.findViewById(R.id.textDescription);
            imageViewCharacter = itemView.findViewById(R.id.imageView2);

        }

    }



    @NonNull
    @Override
    public CustumeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustumeAdapter.MyViewHolder holder, int position) {

        TextView textViewName = holder.textViewName;
        TextView textViewDescription = holder.textViewDescription;
        ImageView imageViewCharacter =holder.imageViewCharacter;

        textViewName.setText(dataset.get(position).getName());
        textViewDescription.setText(dataset.get(position).getDescription());
        imageViewCharacter.setImageResource(dataset.get(position).getImage());

    }


    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
