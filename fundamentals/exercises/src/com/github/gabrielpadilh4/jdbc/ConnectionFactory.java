package com.github.gabrielpadilh4.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    public static Connection getConnection() {

        try {

            Properties properties = getProperties();

            String url = properties.getProperty("database.url");
            String user = properties.getProperty("database.user");
            String password = properties.getProperty("database.password");

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Get database connection failed");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Load connection.properties failed");
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw e;
        }

    }

    private static Properties getProperties() throws IOException {

        Properties properties = new Properties();

        String path = "/connection.properties";

        properties.load(ConnectionFactory.class.getResourceAsStream(path));

        return properties;

    }
}
