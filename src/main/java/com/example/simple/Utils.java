package com.example.simple;

public class Utils {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Utils(Animal animal) {
        this.animal = animal;
    }

    void hello() {
        System.out.println(animal.say());;
    }
}
