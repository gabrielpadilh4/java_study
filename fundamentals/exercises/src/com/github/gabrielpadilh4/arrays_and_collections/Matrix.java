package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many members ?");
        int membersQty = in.nextInt();

        System.out.println("How many results ?");
        int resultQty = in.nextInt();

        double[][] teamResult = new double[membersQty][resultQty];
        double teamTotal = 0;

        for (int i = 0; i < teamResult.length; i++) {

            for (int j = 0; j < teamResult[i].length; j++) {
                System.out.printf("Enter the result %d of member %d :", j, i);
                teamResult[i][j] = in.nextDouble();
                teamTotal = teamResult[i][j];
            }

        }

        double average = teamTotal / (membersQty * resultQty);

        System.out.println(average);

        in.close();
    }

}
