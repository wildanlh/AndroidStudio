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
import com.example.vehicleapp.model.CarsModel;
import com.example.vehicleapp.model.PlanesModel;

public class PlanesAdapter extends RecyclerView.Adapter<PlanesAdapter.MyViewHolder>  {

    private Context context;
    private PlanesModel[] planesModels;

    public PlanesAdapter(Context context, PlanesModel[] planesModels) {
        this.context = context;
        this.planesModels = planesModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final PlanesModel planes = planesModels[position];

        holder.imgPlanes.setImageResource(planes.getImagePlanes());
        holder.txtPlanes.setText(planes.getTextPlanes());
    }

    @Override
    public int getItemCount() {
        return planesModels.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPlanes;
        TextView txtPlanes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPlanes = itemView.findViewById(R.id.image_vehicle);
            txtPlanes = itemView.findViewById(R.id.vehicle_txt);
        }
    }
}
