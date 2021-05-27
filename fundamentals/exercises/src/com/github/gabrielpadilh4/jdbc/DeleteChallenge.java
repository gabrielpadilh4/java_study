package com.github.gabrielpadilh4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteChallenge {

    public static void main(String[] args) throws SQLException {

        int code, linesAffected;
        String sql = "DELETE FROM people WHERE CODE = ?";
        Connection connection;
        PreparedStatement pstmt;

        Scanner in = new Scanner(System.in);

        System.out.print("Code to delete: ");
        code = in.nextInt();

        in.close();

        connection = ConnectionFactory.getConnection();

        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, code);

        linesAffected = pstmt.executeUpdate();

        if (linesAffected > 0) {
            System.out.println("Delete completed");
            System.out.println("Lines deleted: " + linesAffected);
        } else {
            System.out.println("Nothing changed");
        }

        pstmt.close();
        connection.close();

    }
}
