package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class UpdateChallenge {

    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);

        System.out.println("Code: ");

        int code = Integer.parseInt(in.nextLine());

        System.out.println("New name: ");

        String updatedName = in.nextLine();

        String sql = "UPDATE people SET name = ? WHERE code = ?";

        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, updatedName);
        stmt.setInt(2, code);
        stmt.execute();

        stmt.close();
        connection.close();
        in.close();

    }
}
