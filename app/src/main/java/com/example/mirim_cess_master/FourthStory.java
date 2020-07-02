package com.example.mirim_cess_master;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mirim_cess_master.fourth.Frag_Fourth_Story8_1;
import com.example.mirim_cess_master.fourth.Frag_Fourth_Story8_2;
import com.google.android.material.tabs.TabLayout;

public class FourthStory extends AppCompatActivity {
    private static MediaPlayer mp;
    private AnimationDrawable aniFrame;
    MediaPlayer mp_four1;
    MediaPlayer mp_four2;
    MediaPlayer mp_four3;
    MediaPlayer mp_four4;
    MediaPlayer mp_four5;
    MediaPlayer mp_four6;
    MediaPlayer mp_four7;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_story);

        mp = MediaPlayer.create(this, R.raw.speechless);
        mp.setLooping(true);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        //뷰페이저 세팅
        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter_Fourth(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("ITPANGPANG","onPageScrolled : "+position);
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0 :
                        try {
                            if (mp_four2 != null) {
                                if (mp_four2.isPlaying()) {
                                    mp_four2.stop();
                                    mp_four2.reset();
                                }
                                mp_four2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four1 = MediaPlayer.create(getApplicationContext(),R.raw.four1);
                        mp_four1.setLooping(false);
                        mp_four1.start();
                        mp_four1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw1 = (TypeWriter)findViewById(R.id.write1);
                        Button btn1 = (Button)findViewById(R.id.s_btn1);
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw1.setText("");
                                tw1.setCharacterDelay(150);
                                tw1.animateText("헐, 2주밖에 안 남았잖아??");
                            }
                        });
                        btn1.performClick();
                        break;
                    case 1:
                        try {
                            if (mp_four1 != null) {
                                if (mp_four1.isPlaying()) {
                                    mp_four1.stop();
                                    mp_four1.reset();
                                }
                                mp_four1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four3 != null) {
                                if (mp_four3.isPlaying()) {
                                    mp_four3.stop();
                                    mp_four3.reset();
                                }
                                mp_four3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four2 = MediaPlayer.create(getApplicationContext(),R.raw.four2);
                        mp_four2.setLooping(false);
                        mp_four2.start();
                        mp_four2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        ImageView gomin = (ImageView)findViewById(R.id.gomin);
                        if(gomin != null) {
                            gomin.setBackgroundResource(R.drawable.arrow_four2);
                            aniFrame = (AnimationDrawable) gomin.getBackground();
                        }
                        final TypeWriter tw2 = (TypeWriter)findViewById(R.id.write2);
                        Button btn2 = (Button)findViewById(R.id.s_btn2);
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw2.setText("");
                                tw2.setCharacterDelay(150);
                                tw2.animateText("이미 망했어...");

                                aniFrame.start();
                            }
                        });
                        btn2.performClick();
                        break;
                    case 2:
                        try {
                            if (mp_four2 != null) {
                                if (mp_four2.isPlaying()) {
                                    mp_four2.stop();
                                    mp_four2.reset();
                                }
                                mp_four2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four4 != null) {
                                if (mp_four4.isPlaying()) {
                                    mp_four4.stop();
                                    mp_four4.reset();
                                }
                                mp_four4 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four3 = MediaPlayer.create(getApplicationContext(),R.raw.four3);
                        mp_four3.setLooping(false);
                        mp_four3.start();
                        mp_four3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        ImageView lamp = (ImageView)findViewById(R.id.lamp);
                        if(lamp != null) {
                            lamp.setBackgroundResource(R.drawable.arrow_four3);
                            aniFrame = (AnimationDrawable) lamp.getBackground();
                        }
                        final TypeWriter tw3 = (TypeWriter)findViewById(R.id.write3);
                        Button btn3 = (Button)findViewById(R.id.s_btn3);
                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw3.setText("");
                                tw3.setCharacterDelay(150);
                                tw3.animateText("램프? 저기에 왜 램프가 있지??");

                                aniFrame.start();
                            }
                        });
                        btn3.performClick();
                        break;
                    case 3:
                        try {
                            if (mp_four3 != null) {
                                if (mp_four3.isPlaying()) {
                                    mp_four3.stop();
                                    mp_four3.reset();
                                }
                                mp_four3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four5 != null) {
                                if (mp_four5.isPlaying()) {
                                    mp_four5.stop();
                                    mp_four5.reset();
                                }
                                mp_four5 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four4 = MediaPlayer.create(getApplicationContext(),R.raw.four4);
                        mp_four4.setLooping(false);
                        mp_four4.start();
                        mp_four4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw4 = (TypeWriter)findViewById(R.id.write4);
                        Button btn4 = (Button)findViewById(R.id.s_btn4);
                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw4.setText("");
                                tw4.setCharacterDelay(150);
                                tw4.animateText("꺅!!!");
                            }
                        });
                        btn4.performClick();
                        break;
                    case 4:
                        try {
                            if (mp_four4 != null) {
                                if (mp_four4.isPlaying()) {
                                    mp_four4.stop();
                                    mp_four4.reset();
                                }
                                mp_four4 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four6 != null) {
                                if (mp_four6.isPlaying()) {
                                    mp_four6.stop();
                                    mp_four6.reset();
                                }
                                mp_four6 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four5 = MediaPlayer.create(getApplicationContext(),R.raw.four5);
                        mp_four5.setLooping(false);
                        mp_four5.start();
                        mp_four5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw5 = (TypeWriter)findViewById(R.id.write5);
                        final TypeWriter tw6 = (TypeWriter)findViewById(R.id.write6);
                        Button btn5 = (Button)findViewById(R.id.s_btn5);
                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw5.setText("");
                                tw5.setCharacterDelay(150);
                                tw5.animateText("무슨 소원을 빌고 싶어서 나를 부른거야??");
                                tw6.setText("");
                                tw6.setCharacterDelay(80);
                                tw6.animateText("                                             시험이 2주밖에 남지 않았어. 너의 도움이 필요해!.");
                            }
                        });
                        btn5.performClick();
                        break;
                    case 5:
                        try {
                            if (mp_four5 != null) {
                                if (mp_four5.isPlaying()) {
                                    mp_four5.stop();
                                    mp_four5.reset();
                                }
                                mp_four5 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four7 != null) {
                                if (mp_four7.isPlaying()) {
                                    mp_four7.stop();
                                    mp_four7.reset();
                                }
                                mp_four7 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four6 = MediaPlayer.create(getApplicationContext(),R.raw.jini2);
                        mp_four6.setLooping(false);
                        mp_four6.start();
                        mp_four6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw7 = (TypeWriter)findViewById(R.id.write7);
                        Button btn6 = (Button)findViewById(R.id.s_btn6);
                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw7.setText("");
                                tw7.setCharacterDelay(150);
                                tw7.animateText("흠.. 알겠어.");
                            }
                        });
                        btn6.performClick();
                        break;
                    case 6:
                        try {
                            if (mp_four6 != null) {
                                if (mp_four6.isPlaying()) {
                                    mp_four6.stop();
                                    mp_four6.reset();
                                }
                                mp_four6 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_four7 = MediaPlayer.create(getApplicationContext(),R.raw.book);
                        mp_four7.setLooping(false);
                        mp_four7.start();
                        mp_four7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        Button happy = (Button) findViewById(R.id.happy);
                        happy.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_four7 != null) {
                                        if (mp_four7.isPlaying()) {
                                            mp_four7.stop();
                                        }
                                        mp_four7 = null;
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }
                                Intent intent = new Intent(getApplicationContext(), Frag_Fourth_Story8_1.class);
                                startActivity(intent);
                            }
                        });

                        Button sad = (Button) findViewById(R.id.sad);
                        sad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_four7 != null) {
                                        if (mp_four7.isPlaying()) {
                                            mp_four7.stop();
                                        }
                                        mp_four7 = null;
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }
                                Intent intent = new Intent(getApplicationContext(), Frag_Fourth_Story8_2.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    default:
                        try {
                            if (mp_four7 != null) {
                                if (mp_four7.isPlaying()) {
                                    mp_four7.stop();
                                    mp_four7.reset();
                                }
                                mp_four7 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_four1 != null) {
                                if (mp_four1.isPlaying()) {
                                    mp_four1.stop();
                                    mp_four1.reset();
                                }
                                mp_four1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                }
                Log.d("ITPANGPANG","onPageSelected : "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.d("ITPANGPANG","onPageScrollStateChanged : "+state);
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        mp.pause();
        super.onUserLeaveHint();
    }

    @Override
    protected void onResume() {
        mp.start();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mp.stop();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        try {
            if (mp_four1 != null) {
                if (mp_four1.isPlaying()) {
                    mp_four1.stop();
                    mp_four1.reset();
                }
                mp_four1 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four2 != null) {
                if (mp_four2.isPlaying()) {
                    mp_four2.stop();
                    mp_four2.reset();
                }
                mp_four2 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four3 != null) {
                if (mp_four3.isPlaying()) {
                    mp_four3.stop();
                    mp_four3.reset();
                }
                mp_four3 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four4 != null) {
                if (mp_four4.isPlaying()) {
                    mp_four4.stop();
                    mp_four4.reset();
                }
                mp_four4 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four5 != null) {
                if (mp_four5.isPlaying()) {
                    mp_four5.stop();
                    mp_four5.reset();
                }
                mp_four5 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four6 != null) {
                if (mp_four6.isPlaying()) {
                    mp_four6.stop();
                    mp_four6.reset();
                }
                mp_four6 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_four7 != null) {
                if (mp_four7.isPlaying()) {
                    mp_four7.stop();
                    mp_four7.reset();
                }
                mp_four7 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        mp.stop();
        super.onBackPressed();
    }
}