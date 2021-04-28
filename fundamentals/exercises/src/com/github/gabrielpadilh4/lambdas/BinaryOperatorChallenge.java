package com.github.gabrielpadilh4.lambdas;

import com.github.gabrielpadilh4.oo.composition.challenge.Product;

import java.util.function.UnaryOperator;

public class BinaryOperatorChallenge {

    public static void main(String[] args) {

        Product p = new Product("Notebook", 1299.50);

        /* Calculate product price with taxes: price >= 2500 (8,5) | price < 2500 (0%) */

        UnaryOperator<Double> taxes = (Double price) -> {
            if (price >= 2500) {
                return price * (1 + 8.5);
            }

            return price;
        };

        System.out.println("Price with taxes: " + taxes.apply(p.getPrice()));

        /* Calculate ship value: price >= 3000 (100) | price < 3000 (50)*/

        UnaryOperator<Double> withShipValue = (Double value) -> value >= 3000 ? value + 100 : value + 50;

        System.out.println("Price with ship value: " + taxes.andThen(withShipValue).apply(p.getPrice()));

        System.out.println();
    }
}
