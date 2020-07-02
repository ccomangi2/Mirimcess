package com.example.mirim_cess_master;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mirim_cess_master.first.Frag_First_Story7_1;
import com.example.mirim_cess_master.first.Frag_First_Story7_2;
import com.google.android.material.tabs.TabLayout;

public class FirstStory extends AppCompatActivity {
    MediaPlayer mp;
    MediaPlayer mp_one1;
    MediaPlayer mp_one2;
    MediaPlayer mp_one3;
    MediaPlayer mp_one4;
    MediaPlayer mp_one5;
    MediaPlayer mp_one6;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_story);

        mp = MediaPlayer.create(this, R.raw.underthesea);
        mp.setLooping(true);
        mp.start();

        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

        //뷰페이저 세팅
        final ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdapter_First(getSupportFragmentManager());

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
                    case 0:
                        try {
                            if (mp_one2 != null) {
                                if (mp_one2.isPlaying()) {
                                    mp_one2.stop();
                                    mp_one2.reset();
                                }
                                mp_one2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_one1 = MediaPlayer.create(getApplicationContext(), R.raw.one1);
                        mp_one1.setLooping(false);
                        mp_one1.start();
                        mp_one1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
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
                                tw1.animateText("학교는 어떤 곳일까? 너무 기대된다!.");
                            }
                        });
                        btn1.performClick();
                        break;
                    case 1:
                        try {
                            if (mp_one1 != null) {
                                if (mp_one1.isPlaying()) {
                                    mp_one1.stop();
                                    mp_one1.reset();
                                }
                                mp_one1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_one3 != null) {
                                if (mp_one3.isPlaying()) {
                                    mp_one3.stop();
                                    mp_one3.reset();
                                }
                                mp_one3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_one2 = MediaPlayer.create(getApplicationContext(), R.raw.one2);
                        mp_one2.setLooping(false);
                        mp_one2.start();
                        mp_one2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw2 = (TypeWriter)findViewById(R.id.write2);
                        final TypeWriter tw3 = (TypeWriter)findViewById(R.id.write3);
                        Button btn2 = (Button)findViewById(R.id.s_btn2);
                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw2.setText("");
                                tw2.setCharacterDelay(150);
                                tw2.animateText("수행평가가 너무 많아 ㅠㅠㅠ");
                                tw3.setText("");
                                tw3.setCharacterDelay(150);
                                tw3.animateText("                   뭐?!?!?! 그런 게 있다고??");
                            }
                        });
                        btn2.performClick();
                        break;
                    case 2:
                        ImageView fish = findViewById(R.id.fish);
                        Animation anima = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                        fish.startAnimation(anima);
                        try {
                            if (mp_one2 != null) {
                                if (mp_one2.isPlaying()) {
                                    mp_one2.stop();
                                    mp_one2.reset();
                                }
                                mp_one2 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_one4 != null) {
                                if (mp_one4.isPlaying()) {
                                    mp_one4.stop();
                                    mp_one4.reset();
                                }
                                mp_one4 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_one3 = MediaPlayer.create(getApplicationContext(), R.raw.one3);
                        mp_one3.setLooping(false);
                        mp_one3.start();
                        mp_one3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw4 = (TypeWriter)findViewById(R.id.write4);
                        final TypeWriter tw5 = (TypeWriter)findViewById(R.id.write5);
                        Button btn3 = (Button)findViewById(R.id.s_btn3);
                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw4.setText("");
                                tw4.setCharacterDelay(150);
                                tw4.animateText("무엇을 원하느냐..");
                                tw5.setText("");
                                tw5.setCharacterDelay(150);
                                tw5.animateText("             수행평가를 잘 보고 싶습니다..");
                            }
                        });
                        btn3.performClick();
                        break;
                    case 3:
                        try {
                            if (mp_one3 != null) {
                                if (mp_one3.isPlaying()) {
                                    mp_one3.stop();
                                    mp_one3.reset();
                                }
                                mp_one3 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_one5 != null) {
                                if (mp_one5.isPlaying()) {
                                    mp_one5.stop();
                                    mp_one5.reset();
                                }
                                mp_one5 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_one4 = MediaPlayer.create(getApplicationContext(), R.raw.one4);
                        mp_one4.setLooping(false);
                        mp_one4.start();
                        mp_one4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw6 = (TypeWriter)findViewById(R.id.write6);
                        final TypeWriter tw7 = (TypeWriter)findViewById(R.id.write7);
                        Button btn4 = (Button)findViewById(R.id.s_btn4);
                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw6.setText("");
                                tw6.setCharacterDelay(150);
                                tw6.animateText("이것만 먹으면 된다는 거지??");
                                tw7.setText("");
                                tw7.setCharacterDelay(150);
                                tw7.animateText("                                이거 효과 대박인데? 다음에 또 가야지. (몸에 안 좋은건 기분 탓인가?).");
                            }
                        });
                        btn4.performClick();
                        break;
                    case 4:
                        try {
                            if (mp_one4 != null) {
                                if (mp_one4.isPlaying()) {
                                    mp_one4.stop();
                                    mp_one4.reset();
                                }
                                mp_one4 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_one6 != null) {
                                if (mp_one6.isPlaying()) {
                                    mp_one6.stop();
                                    mp_one6.reset();
                                }
                                mp_one6 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        mp_one5 = MediaPlayer.create(getApplicationContext(), R.raw.one5);
                        mp_one5.setLooping(false);
                        mp_one5.start();
                        mp_one5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                        final TypeWriter tw8 = (TypeWriter)findViewById(R.id.write8);
                        Button btn5 = (Button)findViewById(R.id.s_btn5);
                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw8.setText("");
                                tw8.setCharacterDelay(150);
                                tw8.animateText("스누피 마녀에게 너무 자주 가지마.. 언니 말 꼭 명심해.");
                            }
                        });
                        btn5.performClick();
                        break;
                    case 5:
                        try {
                            if (mp_one5 != null) {
                                if (mp_one5.isPlaying()) {
                                    mp_one5.stop();
                                    mp_one5.reset();
                                }
                                mp_one5 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        Button sound = findViewById(R.id.sound);
                        sound.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mp_one6 = MediaPlayer.create(getApplicationContext(), R.raw.one6);
                                mp_one6.setLooping(false);
                                mp_one6.start();
                                mp_one6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mediaPlayer) {
                                        mediaPlayer.release();
                                    }
                                });
                            }
                        });
                        sound.performClick();

                        final TypeWriter tw9 = (TypeWriter)findViewById(R.id.write9);
                        Button btn6 = (Button)findViewById(R.id.s_btn6);
                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tw9.setText("");
                                tw9.setCharacterDelay(150);
                                tw9.animateText("수행평가 딱 1개 남았는데 어떡하지? 언니 말 들을까?   마지막으로 딱 한 번만 더 갈까??");
                            }
                        });
                        btn6.performClick();

                        Button happy = (Button) findViewById(R.id.happy);
                        happy.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_one6 != null) {
                                        if (mp_one6.isPlaying()) {
                                            mp_one6.pause();
                                            mp_one6.release();
                                            mp_one6 = null;
                                        }
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }

                                Intent intent = new Intent(getApplicationContext(), Frag_First_Story7_1.class);
                                startActivity(intent);
                            }
                        });

                        Button sad = (Button) findViewById(R.id.sad);
                        sad.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                try {
                                    if (mp_one6 != null) {
                                        if (mp_one6.isPlaying()) {
                                            mp_one6.pause();
                                            mp_one6.release();
                                            mp_one6 = null;
                                        }
                                    }
                                } catch (IllegalStateException e) {
                                    e.printStackTrace();
                                }

                                Intent intent = new Intent(getApplicationContext(), Frag_First_Story7_2.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    default:
                        try {
                            if (mp_one1 != null) {
                                if (mp_one1.isPlaying()) {
                                    mp_one1.stop();
                                    mp_one1.reset();
                                }
                                mp_one1 = null;
                            }
                        } catch (IllegalStateException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (mp_one6 != null) {
                                if (mp_one6.isPlaying()) {
                                    mp_one6.stop();
                                    mp_one6.reset();
                                }
                                mp_one6 = null;
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
    /*
    0 : SCROLL_STATE_IDLE           //종료시점
    1 : SCROLL_STATE_DRAGGING       //swipe
    2 : SCROLL_STATE_SETTLING       //고정됨
    */

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
            if (mp_one1 != null) {
                if (mp_one1.isPlaying()) {
                    mp_one1.stop();
                    mp_one1.reset();
                }
                mp_one1 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_one2 != null) {
                if (mp_one2.isPlaying()) {
                    mp_one2.stop();
                    mp_one2.reset();
                }
                mp_one2 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_one3 != null) {
                if (mp_one3.isPlaying()) {
                    mp_one3.stop();
                    mp_one3.reset();
                }
                mp_one3 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_one4 != null) {
                if (mp_one4.isPlaying()) {
                    mp_one4.stop();
                    mp_one4.reset();
                }
                mp_one4 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_one5 != null) {
                if (mp_one5.isPlaying()) {
                    mp_one5.stop();
                    mp_one5.reset();
                }
                mp_one5 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            if (mp_one6 != null) {
                if (mp_one6.isPlaying()) {
                    mp_one6.stop();
                    mp_one6.reset();
                }
                mp_one6 = null;
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        mp.stop();
        super.onBackPressed();
    }
}