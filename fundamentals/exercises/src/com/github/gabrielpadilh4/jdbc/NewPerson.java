package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPerson {

    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = in.nextLine();


        String sql = "INSERT INTO people (name) VALUES (?)";

        System.out.println("Command: " + sql + "\nParameters: " + name);

        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, name);
        stmt.execute();
        stmt.close();

        connection.close();
        in.close();

    }
}
