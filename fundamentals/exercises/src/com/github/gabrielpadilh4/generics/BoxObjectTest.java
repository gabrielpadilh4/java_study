package com.github.gabrielpadilh4.generics;

public class BoxObjectTest {

    public static void main(String[] args) {
        BoxObject box = new BoxObject();

        box.setStuff(2.3);

        System.out.println((Double) box.getStuff());
    }
}
