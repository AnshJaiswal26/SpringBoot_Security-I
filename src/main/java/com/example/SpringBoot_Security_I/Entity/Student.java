package com.example.SpringBoot_Security_I.Entity;


import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private float marks;
    private int age;

    public Student(int id, String name, float marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }
}
