package com.example.simplecalculator;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBUser {

    private DatabaseReference databaseReference;

    public DBUser ()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(UserName.class.getSimpleName());
    }

    public Task <Void> add(UserName user)
    {
     return databaseReference.push().setValue(user);
    }
}
