package com.github.gabrielpadilh4;

public class LogicOperatorsChallenge {

    public static void main(String[] args) {

        boolean job1 = true;
        boolean job2 = true;

        boolean buyTV50 = job1 && job2;
        boolean buyTV32 = job1 ^ job2;
        boolean buyIceCream = job1 || job2;

        System.out.println("Buy TV32? " + buyTV32);
        System.out.println("Buy TV50? " + buyTV50);

        System.out.println("Buy IceCream?" + buyIceCream);

        System.out.println("Without icecream?" + !buyIceCream);

    }
}
