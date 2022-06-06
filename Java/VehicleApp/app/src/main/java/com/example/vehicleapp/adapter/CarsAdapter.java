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

import java.util.List;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.MyViewHolder> {

    private Context context;
    private CarsModel[] carsModels;

    public CarsAdapter(Context context, CarsModel[] carsModels) {
        this.context = context;
        this.carsModels = carsModels;
    }

    @NonNull
    @Override
    public CarsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.MyViewHolder holder, int position) {
        final CarsModel cars = carsModels[position];

        holder.imgCars.setImageResource(cars.getImageCars());
        holder.txtCars.setText(cars.getTextCars());
    }

    @Override
    public int getItemCount() {
        return carsModels.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgCars;
        TextView txtCars;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCars = itemView.findViewById(R.id.image_vehicle);
            txtCars = itemView.findViewById(R.id.vehicle_txt);
        }
    }
}
