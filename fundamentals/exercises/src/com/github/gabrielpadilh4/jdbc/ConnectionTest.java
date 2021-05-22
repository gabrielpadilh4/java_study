package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "my-secure-password";

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connection opened");

        connection.close();

        System.out.println("Connection closed");

    }
}
