package com.example.mobileapp.activityexamplepb4;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class Student implements Serializable {
    private String name;
    private String email;
    private List<Student> studentList;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List addStudent(String name, String email) {
        studentList.add(new Student(name, email));
        return studentList;
    }

}
