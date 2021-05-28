package com.github.gabrielpadilh4.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDAO extends DAO {

    private final String INSERT_SQL = "INSERT INTO cars(name, brand, year) VALUES (?, ?, ?)";
    private final String UPDATE_SQL = "UPDATE cars SET name = ?, brand = ?, year = ? WHERE code = ?";
    private final String SELECT_SQL = "SELECT code, name, brand, year FROM cars WHERE code = IFNULL(?, code)";
    private final String DELETE_SQL = "DELETE FROM cars WHERE code = ?";

    public void createCar(Car car){

        List<Object> parameters = new ArrayList<>();

        parameters.add(car.getName());
        parameters.add(car.getBrand());
        parameters.add(car.getYear());

        int code = create(INSERT_SQL, parameters.toArray());

        car.setCode(code);

        System.out.println("Car code: " + car.getCode());
    }

    public void updateCar(Car car){

        List<Object> parameters = new ArrayList<>();

        parameters.add(car.getName());
        parameters.add(car.getBrand());
        parameters.add(car.getYear());
        parameters.add(car.getCode());

        int rows = update(UPDATE_SQL, parameters.toArray());

        System.out.println("Rows updated: " + rows);
    }

    public List<Car> readCar(int filter){ // TODO - Improve filter

        List<Object> parameters = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        parameters.add(filter);

        ResultSet result = read(SELECT_SQL, parameters.toArray());

        try{
            while (result.next()){

                String name, brand;
                int code, year;

                name = result.getString("NAME");
                brand = result.getString("BRAND");
                year = result.getInt("YEAR");
                code = result.getInt("CODE");

                Car c = new Car(name, brand, year);

                c.setCode(code);

                cars.add(c);
            }
        } catch (SQLException e) {
            // do nothing
        }

        return cars;
    }

    public void deleteCar(Car car){

        List<Object> parameters = new ArrayList<>();

        parameters.add(car.getCode());

        int rows = create(DELETE_SQL, parameters.toArray());

        System.out.println("Rows deleted: " + rows);
    }
}
