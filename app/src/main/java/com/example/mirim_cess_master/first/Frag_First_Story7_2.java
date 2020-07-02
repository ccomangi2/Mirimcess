package com.example.mirim_cess_master.first;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.TypeWriter;

public class Frag_First_Story7_2 extends AppCompatActivity {
    MediaPlayer mp_one;
    MediaPlayer mp_back;
    private AnimationDrawable aniFrame;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_first7_2);

        ImageView lamp = (ImageView)findViewById(R.id.bubble);
        if(lamp != null) {
            lamp.setBackgroundResource(R.drawable.arrow_first7_2);
            aniFrame = (AnimationDrawable) lamp.getBackground();
        }
        final TypeWriter tw = (TypeWriter)findViewById(R.id.ending1);
        Button btn = (Button)findViewById(R.id.s_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("");
                tw.setCharacterDelay(150);
                tw.animateText("언니 말 들을걸 ㅠㅜㅠ");

                aniFrame.start();
            }
        });
        btn.performClick();

        mp_one = MediaPlayer.create(getApplicationContext(),R.raw.one7_2);
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
