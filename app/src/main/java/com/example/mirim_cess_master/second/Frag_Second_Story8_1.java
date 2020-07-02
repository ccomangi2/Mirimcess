package com.example.mirim_cess_master.second;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mirim_cess_master.R;
import com.example.mirim_cess_master.TypeWriter;

public class Frag_Second_Story8_1 extends AppCompatActivity {
    MediaPlayer mp_two;
    MediaPlayer mp_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_second8_1);

        final TypeWriter tw = (TypeWriter)findViewById(R.id.ending1);
        Button btn = (Button)findViewById(R.id.s_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("");
                tw.setCharacterDelay(150);
                tw.animateText("와! 드디어 됐다!!");
            }
        });
        btn.performClick();

        mp_two = MediaPlayer.create(getApplicationContext(),R.raw.moana8_1);
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
