package com.example.mirim_cess_master.fourth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Frag_Fourth_Story5 extends Fragment {
    private View view;
    private TextView tv5;
    private TextView tv6;

    public static Frag_Fourth_Story5 newInstance() {
        Frag_Fourth_Story5 frag_fourth_story5 = new Frag_Fourth_Story5();

        return frag_fourth_story5;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_fourth5, container, false);
        tv5 = view.findViewById(R.id.tv5);
        tv6 = view.findViewById(R.id.tv6);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("users").child("name").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String user = dataSnapshot.getValue(String.class);
                tv5.setText(user);
                tv6.setText(user);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        return view;
    }
}
