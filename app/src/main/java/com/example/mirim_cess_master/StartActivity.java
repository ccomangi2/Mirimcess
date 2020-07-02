package com.example.mirim_cess_master;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;

import org.w3c.dom.Text;

import java.sql.Ref;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends  AppCompatActivity {
    ViewPager viewPager;
    EditText goodtv1;
    EditText goodtv2;
    EditText goodtv3;
    String shared = "file";

    MediaPlayer mediaPlayer;

    private static final String TAG = "StartActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        goodtv1 = findViewById(R.id.goodtv1);
        goodtv2 = findViewById(R.id.goodtv2);
        goodtv3 = findViewById(R.id.goodtv3);

        final int[] voteCount = new int[3];
        for(int i=0; i<voteCount.length; i++)
            voteCount[i] = 0;

        ImageView[] image = new ImageView[3];
        int[] imageId = {R.id.good1, R.id.good2, R.id.good3};
        final EditText[] textViews = {goodtv1, goodtv2, goodtv3};

        for(int i=0; i<voteCount.length; i++) {
            final int index;
            index = i;

            image[index] = (ImageView)findViewById(imageId[index]);
            image[index].setOnClickListener(new OnSingleClickListener() {
                @Override
                public void onSingleClick(View v) {
                    voteCount[index]++;
                    textViews[index].setText(String.valueOf(voteCount[index]));
                }
            });
            SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
            String value = sharedPreferences.getString("key","");
            textViews[index].setText(value);
        }
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter_MainSilde viewPagerAdapter = new ViewPagerAdapter_MainSilde(this);
        viewPager.setAdapter(viewPagerAdapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 4000, 4000);
    }
    @Override protected void onDestroy() {
        super.onDestroy();
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value1 = goodtv1.getText().toString();
        String value2 = goodtv2.getText().toString();
        String value3 = goodtv3.getText().toString();
        editor.putString("key", value1);
        editor.putString("key", value2);
        editor.putString("key", value3);
        editor.commit();
    }

    public void firststory (View view){
        Intent intent = new Intent(StartActivity.this, FirstStory.class);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.one1);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        startActivity(intent);
    }

    public void secondstory(View view) {
        Intent intent = new Intent(StartActivity.this, SecondStory.class);
        startActivity(intent);
    }

    public void fourthstory(View view){
        Intent intent = new Intent(StartActivity.this, FourthStory.class);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.four1);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        startActivity(intent);
    }

    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            StartActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
