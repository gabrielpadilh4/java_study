package com.github.gabrielpadilh4.jdbc.dao;

import java.util.List;
import java.util.function.Consumer;

public class DAOTest {
    public static void main(String[] args) {

        Car myCar = new Car("Corsa", "Chevrolet", 2003);

        CarDAO carDAO = new CarDAO();

        carDAO.createCar(myCar);

        List<Car> cars = carDAO.readCar(0);

        Consumer<Car> consumer = System.out::println;

        cars.stream().forEach(consumer);

       // cars = carDAO.readCar(1);
        System.out.println("\n\n");
        cars.stream().forEach(consumer);

        for (Car c : cars) {
            if(c.getBrand().equalsIgnoreCase("Chevrolet")){
                carDAO.deleteCar(c);
            }
        }

    }
}
