package com.example.listvaccinerealtimeapp;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOList {
    private DatabaseReference databaseReference;

    public DAOList () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(List.class.getSimpleName());
    }

    public Task<Void> add (List emp) {
        return databaseReference.push().setValue(emp);
    }
}
