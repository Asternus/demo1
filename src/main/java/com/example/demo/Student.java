package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }
}
