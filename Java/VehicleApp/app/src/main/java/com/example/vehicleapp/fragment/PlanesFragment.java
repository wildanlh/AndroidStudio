package com.example.vehicleapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vehicleapp.R;
import com.example.vehicleapp.adapter.PlanesAdapter;
import com.example.vehicleapp.model.PlanesModel;

public class PlanesFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_planes, container, false);
        recyclerView = view.findViewById(R.id.recycler_planes);

        PlanesModel[] planesModels = new PlanesModel[]{
                new PlanesModel(R.drawable.boeing, "Boeing-737"),
                new PlanesModel(R.drawable.dassault, "Dassault Mirage 2000"),
                new PlanesModel(R.drawable.aircraft, "Vl-3 Evolution"),
                new PlanesModel(R.drawable.helicopter, "Helicopter")
        };

        PlanesAdapter adapter = new PlanesAdapter(getActivity(), planesModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}