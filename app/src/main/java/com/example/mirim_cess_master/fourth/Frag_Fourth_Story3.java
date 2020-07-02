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

public class Frag_Fourth_Story3 extends Fragment {
    private View view;
    private TextView tv2;
    private TextView tv3;

    public static Frag_Fourth_Story3 newInstance() {
        Frag_Fourth_Story3 frag_fourth_story3 = new Frag_Fourth_Story3();

        return frag_fourth_story3;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_fourth3, container, false);
        tv2 = view.findViewById(R.id.tv2);
        tv3 = view.findViewById(R.id.tv3);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("users").child("name").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String user = dataSnapshot.getValue(String.class);
                tv2.setText(user);
                tv3.setText(user);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        return view;
    }
}
