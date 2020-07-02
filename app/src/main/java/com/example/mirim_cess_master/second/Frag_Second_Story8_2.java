package com.example.mirim_cess_master.second;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mirim_cess_master.R;

public class Frag_Second_Story8_2 extends AppCompatActivity {
    MediaPlayer mp_two;
    MediaPlayer mp_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_second8_2);

        mp_two = MediaPlayer.create(getApplicationContext(),R.raw.sad);
        mp_two.setLooping(false);
        mp_two.start();
        mp_two.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            if (mp_two != null) {
                if (mp_two.isPlaying()) {
                    mp_two.stop();
                    mp_two.reset();
                }
                mp_two = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        super.onBackPressed();
    }
}
