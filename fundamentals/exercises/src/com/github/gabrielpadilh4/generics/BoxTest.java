package com.github.gabrielpadilh4.generics;

public class BoxTest {

    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.setStuff("Stuff 1");

        System.out.println(box.getStuff());

        BoxInt boxA = new BoxInt();

        boxA.setStuff(12313);

        System.out.println(boxA.getStuff());

        BoxNumber<Integer> boxNumber = new BoxNumber<>(); // type must extends Number

    }
}
