package com.example.mirim_cess_master.second;

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

public class Frag_Second_Story5 extends Fragment {
    private View view;

    public static Frag_Second_Story5 newInstance() {
        Frag_Second_Story5 frag_second_story5 = new Frag_Second_Story5();

        return frag_second_story5;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_second5, container, false);

        return view;
    }
}
