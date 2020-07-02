package com.example.mirim_cess_master.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.TypeWriter;

import static com.example.mirim_cess_master.R.*;

public class Frag_First_Story1 extends Fragment {
    private View view;

    public static Frag_First_Story1 newInstance() {
        Frag_First_Story1 frag_first_story1 = new Frag_First_Story1();

        return frag_first_story1;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(layout.frag_first1, container, false);
        final TypeWriter tw1 = (TypeWriter)view.findViewById(R.id.write1);
        Button btn1 = (Button)view.findViewById(R.id.s_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("");
                tw1.setCharacterDelay(150);
                tw1.animateText("학교는 어떤 곳일까? 너무 기대된다.");
            }
        });
        btn1.performClick();
        return view;
    }
}
