package com.example.mirim_cess_master;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mirim_cess_master.second.Frag_Second_Story8_1;
import com.example.mirim_cess_master.second.Frag_Second_Story8_2;
import com.google.android.material.tabs.TabLayout;

public class SecondStory extends AppCompatActivity {
    private static MediaPlayer mp;
    MediaPlayer mp_two1;
    MediaPlayer mp_two2;
    MediaPlayer mp_two3;
    MediaPlayer mp_two4;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_story);

        mp = MediaPlayer.create(this, R.raw.howfargo);
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
        fragmentPagerAdapter = new ViewPagerAdapter_Second(getSupportFragmentManager());

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
                        //mp_two = MediaPlayer.create(getApplicationContext(),R.raw.one1);
                        //mp_two.setLooping(false);
                        //mp_two.start();
                        try {
                            if (mp_two1 != null) {
                                if (mp_two1.isPlaying()) {
                                    mp_two1.stop();
                                    mp_two1.reset();
                                }
                                mp_two1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 1:
                    case 2:
                        try {
                            if (mp_two2 != null) {
                                if (mp_two2.isPlaying()) {
                                    mp_two2.stop();
                                    mp_two2.reset();
                                }
                                mp_two2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_two1 = MediaPlayer.create(getApplicationContext(),R.raw.keyborad);
                        mp_two1.setLooping(false);
                        mp_two1.start();
                        mp_two1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        break;
                    case 3:
                        try {
                            if (mp_two1 != null) {
                                if (mp_two1.isPlaying()) {
                                    mp_two1.stop();
                                    mp_two1.reset();
                                }
                                mp_two1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_two3 != null) {
                                if (mp_two3.isPlaying()) {
                                    mp_two3.stop();
                                    mp_two3.reset();
                                }
                                mp_two3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_two2 = MediaPlayer.create(getApplicationContext(),R.raw.moana4);
                        mp_two2.setLooping(false);
                        mp_two2.start();
                        mp_two2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        break;
                    case 4:
                        try {
                            if (mp_two2 != null) {
                                if (mp_two2.isPlaying()) {
                                    mp_two2.stop();
                                    mp_two2.reset();
                                }
                                mp_two2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_two3 = MediaPlayer.create(getApplicationContext(),R.raw.moana5);
                        mp_two3.setLooping(false);
                        mp_two3.start();
                        mp_two3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
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
                                tw1.animateText("헐.. 빨리 기사님께 찾아가봐!!!");
                            }
                        });
                        btn1.performClick();
                        break;
                    case 5:
                        //mp_two = MediaPlayer.create(getApplicationContext(),R.raw.moana);
                        //mp_two.setLooping(false);
                        //mp_two.start();
                        try {
                            if (mp_two3 != null) {
                                if (mp_two3.isPlaying()) {
                                    mp_two3.stop();
                                    mp_two3.reset();
                                }
                                mp_two3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_two4 != null) {
                                if (mp_two4.isPlaying()) {
                                    mp_two4.stop();
                                    mp_two4.reset();
                                }
                                mp_two4 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        mp_two4 = MediaPlayer.create(getApplicationContext(),R.raw.moana7);
                        mp_two4.setLooping(false);
                        mp_two4.start();
                        mp_two4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw2 = (TypeWriter)findViewById(R.id.write2);
                        Button btn2 = (Button)findViewById(R.id.s_btn2);
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw2.setText("");
                                tw2.setCharacterDelay(150);
                                tw2.animateText("백신을 한 번 돌려봐.");
                            }
                        });
                        btn2.performClick();

                        Button happy = (Button) findViewById(R.id.happy);
                        happy.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_two4 != null) {
                                        if (mp_two4.isPlaying()) {
                                            mp_two4.stop();
                                            mp_two4.reset();
                                        }
                                        mp_two4 = null;
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }
                                Intent intent = new Intent(getApplicationContext(), Frag_Second_Story8_1.class);
                                startActivity(intent);
                            }
                        });

                        Button sad = (Button) findViewById(R.id.sad);
                        sad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_two4 != null) {
                                        if (mp_two4.isPlaying()) {
                                            mp_two4.stop();
                                            mp_two4.reset();
                                        }
                                        mp_two4 = null;
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }
                                Intent intent = new Intent(getApplicationContext(), Frag_Second_Story8_2.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    default:
                        try {
                            if (mp_two4 != null) {
                                if (mp_two4.isPlaying()) {
                                    mp_two4.stop();
                                    mp_two4.reset();
                                }
                                mp_two4 = null;
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
        mp.release();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        try {
            if (mp_two1 != null) {
                if (mp_two1.isPlaying()) {
                    mp_two1.stop();
                    mp_two1.reset();
                }
                mp_two1 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_two2 != null) {
                if (mp_two2.isPlaying()) {
                    mp_two2.stop();
                    mp_two2.reset();
                }
                mp_two2 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_two3 != null) {
                if (mp_two3.isPlaying()) {
                    mp_two3.stop();
                    mp_two3.reset();
                }
                mp_two3 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_two4 != null) {
                if (mp_two4.isPlaying()) {
                    mp_two4.stop();
                    mp_two4.reset();
                }
                mp_two4 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        mp.stop();
        super.onBackPressed();
    }
}