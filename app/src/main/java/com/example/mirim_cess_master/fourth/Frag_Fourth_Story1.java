package com.example.mirim_cess_master.fourth;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.TypeWriter;
import com.example.mirim_cess_master.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Frag_Fourth_Story1 extends Fragment {
    private View view;
    private TextView tv1;

    public static Frag_Fourth_Story1 newInstance() {
        Frag_Fourth_Story1 frag_fourth_story1 = new Frag_Fourth_Story1();

        return frag_fourth_story1;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_fourth1, container, false);
        tv1 = view.findViewById(R.id.tv1);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        final TypeWriter tw1 = (TypeWriter)view.findViewById(R.id.write1);
        Button btn1 = (Button)view.findViewById(R.id.s_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("");
                tw1.setCharacterDelay(150);
                tw1.animateText("헐, 2주밖에 안 남았잖아??");
            }
        });
        btn1.performClick();

        mDatabase.child("users").child("name").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String user = dataSnapshot.getValue(String.class);
                tv1.setText(user);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        return view;
    }
}
