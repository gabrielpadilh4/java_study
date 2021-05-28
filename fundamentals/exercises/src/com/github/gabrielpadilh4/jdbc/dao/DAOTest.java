package com.github.gabrielpadilh4.jdbc.dao;

public class DAOTest {
    public static void main(String[] args) {

        Car myCar = new Car("Corsa", "Chevrolet", 2003);

        CarDAO carDAO = new CarDAO();

        carDAO.createCar(myCar);

    }
}
