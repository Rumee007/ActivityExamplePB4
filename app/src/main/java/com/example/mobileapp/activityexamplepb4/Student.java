package com.example.mobileapp.activityexamplepb4;

import android.util.Log;

import java.io.Serializable;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class Student implements Serializable {
    private String email;
    private String password;

    private static final String TAG = MainActivity.class.getSimpleName();

    public Student(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

