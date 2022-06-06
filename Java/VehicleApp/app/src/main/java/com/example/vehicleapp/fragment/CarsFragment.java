package com.example.vehicleapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vehicleapp.R;
import com.example.vehicleapp.adapter.CarsAdapter;
import com.example.vehicleapp.model.CarsModel;

import java.util.ArrayList;
import java.util.List;

public class CarsFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cars, container, false);
        recyclerView = view.findViewById(R.id.recycler_cars);

        CarsModel[] carsModels = new CarsModel[]{
                new CarsModel(R.drawable.bmw, "BMW i320"),
                new CarsModel(R.drawable.tesla, "Tesla Model S"),
                new CarsModel(R.drawable.audi, "Audi R8"),
                new CarsModel(R.drawable.chevrolet, "Chevrolet Camaro"),
                new CarsModel(R.drawable.toyota, "Toyota Supra")
        };

        CarsAdapter adapter = new CarsAdapter(getActivity(), carsModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }

}