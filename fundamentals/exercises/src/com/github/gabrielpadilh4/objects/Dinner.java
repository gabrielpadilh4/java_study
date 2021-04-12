package com.github.gabrielpadilh4.objects;

public class Dinner {

    public static void main(String[] args) {

        Person person = new Person("Gabriel", 91.0);

        System.out.printf("Weight before eat %.2f", person.weight);
        System.out.println();

        Food apple = new Food("Apple", 0.200);

        Food banana = new Food("Banana", 0.120);

        Food orange = new Food("Orange", 0.300);

        person.eat(apple);
        person.eat(banana);
        person.eat(orange);

        System.out.printf("Person weight after eat: %.2f ", person.weight);

    }
}
