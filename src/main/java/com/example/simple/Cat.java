package com.example.simple;

public class Cat implements Animal{

    private String name;

    @Override
    public String say() {
        return name + " Mew";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
