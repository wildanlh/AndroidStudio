package com.example.vehicleapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vehicleapp.R;
import com.example.vehicleapp.model.BoatsModel;
import com.example.vehicleapp.model.CarsModel;

public class BoatsAdapter extends RecyclerView.Adapter<BoatsAdapter.MyViewHolder> {

    private Context context;
    private BoatsModel[] boatsModels;

    public BoatsAdapter(Context context, BoatsModel[] boatsModels) {
        this.context = context;
        this.boatsModels = boatsModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final BoatsModel boats = boatsModels[position];

        holder.imgBoats.setImageResource(boats.getImageBoats());
        holder.txtBoats.setText(boats.getTextBoats());
    }

    @Override
    public int getItemCount() {
        return boatsModels.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgBoats;
        TextView txtBoats;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBoats = itemView.findViewById(R.id.image_vehicle);
            txtBoats = itemView.findViewById(R.id.vehicle_txt);
        }
    }
}
