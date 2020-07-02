package com.example.mirim_cess_master;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mirim_cess_master.first.Frag_First_Story1;
import com.example.mirim_cess_master.fourth.Frag_Fourth_Story1;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    ImageButton start;

    String id;
    String phonenum;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText); //이름
        editText2 = (EditText)findViewById(R.id.editText2); //전화번호
        start = findViewById(R.id.start); //시작버튼
        mDatabase = FirebaseDatabase.getInstance().getReference(); //Database 초기화

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startUp();
            }
        });
    }
    private void startUp() {
        id = editText.getText().toString();
        phonenum = editText2.getText().toString();

        if (editText.getText().toString().equals("")) {
            Toast myToast = Toast.makeText(getApplicationContext()," 이름을 입력해주세요.", Toast.LENGTH_SHORT);
            myToast.show();
        } else {
            Intent intent = new Intent(MainActivity.this, StartActivity.class);
            startActivity(intent);
        }

        try {
            User user = new User();
            user.name = id;
            user.phone = phonenum;

            mDatabase.child("users").child("name").setValue(id);
            mDatabase.child("users").child("phone").push().setValue(phonenum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

