package com.github.gabrielpadilh4.objects;

public class Person {

    String name;
    double weight;

    Person() {

    }

    Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat(Food food) {
        this.weight = this.weight + food.weight;
    }
}
