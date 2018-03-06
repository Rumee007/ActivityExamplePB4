package com.example.mobileapp.activityexamplepb4;

import java.io.Serializable;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
