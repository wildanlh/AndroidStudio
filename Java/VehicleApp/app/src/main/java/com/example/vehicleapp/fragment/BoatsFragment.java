package com.example.vehicleapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vehicleapp.R;
import com.example.vehicleapp.adapter.BoatsAdapter;
import com.example.vehicleapp.model.BoatsModel;

public class BoatsFragment extends Fragment {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boats, container, false);
        recyclerView = view.findViewById(R.id.recycler_boats);

        BoatsModel[] boatsModels = new BoatsModel[]{
                new BoatsModel(R.drawable.cargo, "Cargo Ship"),
                new BoatsModel(R.drawable.yatch, "Yatch"),
                new BoatsModel(R.drawable.cruise, "Cruise Ship"),
                new BoatsModel(R.drawable.motor, "Motor Boat")
        };

        BoatsAdapter adapter = new BoatsAdapter(getActivity(), boatsModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}