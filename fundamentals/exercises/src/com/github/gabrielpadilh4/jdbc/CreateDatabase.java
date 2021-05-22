package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String user = "root";
        String password = "my-secure-password";

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connection opened");

        Statement stmt = connection.createStatement();

        stmt.execute("CREATE DATABASE IF NOT EXISTS java_study");

        System.out.println("Database created");

        /*stmt.execute("DROP DATABASE IF EXISTS java_study");

        System.out.println("Database drop");*/

        connection.close();

        System.out.println("Connection closed");

    }
}
