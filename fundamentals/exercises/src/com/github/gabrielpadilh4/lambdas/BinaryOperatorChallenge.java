package com.github.gabrielpadilh4.lambdas;

import com.github.gabrielpadilh4.oo.composition.challenge.Product;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorChallenge {

    public static void main(String[] args) {

        Product p = new Product("Notebook", 4000, 0.2);

        /* Calculate product value with discount */

        BinaryOperator<Double> priceDiscount = (Double price, Double discount) -> price * (1 - discount);

        System.out.println("Price with discount: " + priceDiscount.apply(p.getPrice(), p.getDiscount()));

        /* Calculate product price with taxes: price >= 2500 (8,5) | price < 2500 (0%) */

        UnaryOperator<Double> taxes = (Double price) -> {
            if (price >= 2500) {
                return price * (1 + 0.85);
            }

            return price;
        };

        System.out.println("Price with taxes: " + priceDiscount.andThen(taxes).apply(p.getPrice(), p.getDiscount()));

        /* Calculate ship value: price >= 3000 (100) | price < 3000 (50)*/

        UnaryOperator<Double> withShipValue = (Double value) -> value >= 3000 ? value + 100 : value + 50;

        System.out.println("Price with ship value: " + priceDiscount.andThen(taxes).andThen(withShipValue).apply(p.getPrice(), p.getDiscount()));

        // trunc value
        UnaryOperator<Double> truncValue = (Double value) -> Double.parseDouble(String.format("%.2f", value).replace(",","."));

        Function<Double, String> format = (Double value) -> ("R$" + value).replace(".",",");

        System.out.println("Final value: " + priceDiscount.andThen(taxes).andThen(withShipValue).andThen(truncValue).andThen(format).apply(p.getPrice(), p.getDiscount()));
    }
}
