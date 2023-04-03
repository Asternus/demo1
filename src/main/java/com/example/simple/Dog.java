package com.example.simple;

public class Dog implements Animal {

    private String name;

    @Override
    public String say() {
        return name + "Gav";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
