package com.example.mirim_cess_master.second;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;

public class Frag_Second_Story7 extends Fragment {
    private View view;

    public static Frag_Second_Story7 newInstance() {
        Frag_Second_Story7 frag_second_story7 = new Frag_Second_Story7();

        return frag_second_story7;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_second7, container, false);

        return view;
    }
}
