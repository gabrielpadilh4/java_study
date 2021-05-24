package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class QueryChallenge {

    public static void main(String[] args) throws SQLException {

        Scanner in = new Scanner(System.in);

        System.out.println("Find person: ");

        String nameLike = in.nextLine().toUpperCase(Locale.ROOT);

        String sql = "SELECT * FROM people WHERE UPPER(name) LIKE CONCAT('%',?,'%')";

        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, nameLike);

        ResultSet result = stmt.executeQuery();

        while (result.next()){
            System.out.println(result.getString("NAME"));
        }

        stmt.close();
        connection.close();
        in.close();

    }
}
