package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/java_study?verifyServerCertificate=false&useSSL=true";
            String user = "root";
            String password = "my-secure-password";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
