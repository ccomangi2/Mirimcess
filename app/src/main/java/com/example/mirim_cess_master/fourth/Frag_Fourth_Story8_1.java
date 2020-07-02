package com.example.mirim_cess_master.fourth;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Frag_Fourth_Story8_1 extends AppCompatActivity {
    private TextView tv7;
    MediaPlayer mp_four;
    MediaPlayer mp_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_fourth8_1);

        ImageView f8_1 = findViewById(R.id.f8_1);
        Animation anima = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        f8_1.startAnimation(anima);

        mp_four = MediaPlayer.create(getApplicationContext(),R.raw.dding);
        mp_four.setLooping(false);
        mp_four.start();
        mp_four.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        tv7 = findViewById(R.id.tv7);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("users").child("name").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String user = dataSnapshot.getValue(String.class);
                tv7.setText(user);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            if (mp_four != null) {
                if (mp_four.isPlaying()) {
                    mp_four.stop();
                    mp_four.reset();
                }
                mp_four = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        mp_back = MediaPlayer.create(getApplicationContext(),R.raw.book);
        mp_back.setLooping(false);
        mp_back.start();
        mp_back.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        super.onBackPressed();
    }
}
