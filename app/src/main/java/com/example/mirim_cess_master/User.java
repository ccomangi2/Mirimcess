package com.example.mirim_cess_master;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

public class User {
    public String name; //id
    public String phone; //전화번호
    public int startCount = 0; //좋아요 갯수
    public Map<String, Boolean> stars = new HashMap<>(); //좋아요 한 사람
    //String 값은 아이디를 뜻하고, Boolean은 true

    public User() {}

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("phone", phone);
        result.put("stars", stars);

        return result;
    }
}
