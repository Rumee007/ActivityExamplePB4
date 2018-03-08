package com.example.mobileapp.activityexamplepb4;

import android.util.Log;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class Student implements Serializable {
    private String email;
    private String password;
    private List<Student> studentList = new LinkedList<>();

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        Log.i(TAG, "addStudent :" + student);
        studentList.add(student);
    }

}

