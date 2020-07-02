package com.example.mirim_cess_master.first;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.TypeWriter;
import com.example.mirim_cess_master.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Frag_First_Story7_1 extends AppCompatActivity {
    MediaPlayer mp_one;
    MediaPlayer mp_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_first7_1);

        final TypeWriter tw1 = (TypeWriter)findViewById(R.id.ending1);
        final TypeWriter tw2 = (TypeWriter)findViewById(R.id.ending2);
        final TypeWriter tw3 = (TypeWriter)findViewById(R.id.ending3);
        Button btn = (Button)findViewById(R.id.s_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw1.setText("");
                tw1.setCharacterDelay(150);
                tw1.animateText("쳇...");
                tw2.setText("");
                tw2.setCharacterDelay(150);
                tw2.animateText("나 이제 스누피 마녀한테 안 갈게!!!");
                tw3.setText("");
                tw3.setCharacterDelay(150);
                tw3.animateText("                     그래.          잘 생각했어.");
            }
        });
        btn.performClick();

        mp_one = MediaPlayer.create(getApplicationContext(),R.raw.one7_1);
        mp_one.setLooping(false);
        mp_one.start();
        mp_one.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            if (mp_one != null) {
                if (mp_one.isPlaying()) {
                    mp_one.stop();
                    mp_one.reset();
                }
                mp_one = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        super.onBackPressed();
    }
}
