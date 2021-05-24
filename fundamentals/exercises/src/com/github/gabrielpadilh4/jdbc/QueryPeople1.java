package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueryPeople1 {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM people";

        Statement stmt = connection.createStatement();

        ResultSet result = stmt.executeQuery(sql);

        List<Person> people = new ArrayList<>();

        while (result.next()) {
            int code = result.getInt("CODE");
            String name = result.getString("NAME");;

            people.add(new Person(code, name));
        }

        for (Person p : people){
            System.out.println("CODE: " + p.getCode() + " NAME: " + p.getName());
        }

        stmt.close();
        connection.close();
    }
}
