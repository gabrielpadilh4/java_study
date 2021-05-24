package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        connection.close();

        System.out.println("Connection closed");

    }
}
