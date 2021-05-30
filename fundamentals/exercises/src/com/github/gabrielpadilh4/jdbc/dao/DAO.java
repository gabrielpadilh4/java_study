package com.github.gabrielpadilh4.jdbc.dao;

import com.github.gabrielpadilh4.jdbc.ConnectionFactory;

import java.sql.*;

public class DAO implements ICrud {

    private Connection connection;

    @Override
    public Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {
            // do nothing
        }

        connection = ConnectionFactory.getConnection();
        return connection;
    }

    @Override
    public int create(String sql, Object... parameters) {
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            addParameters(pstmt, parameters);

            if (pstmt.executeUpdate() > 0) {

                ResultSet result = pstmt.getGeneratedKeys();

                if (result.next()) {
                    return result.getInt(1);
                }
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResultSet read(String sql, Object... parameters) {
        try {

            PreparedStatement pstmt = getConnection().prepareStatement(sql);

            if(parameters.length > 0){
                addParameters(pstmt, parameters);
            }

            return pstmt.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(String sql, Object... parameters) {
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(sql);

            addParameters(pstmt, parameters);

            return pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(String sql, Object... parameters) {
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(sql);

            addParameters(pstmt, parameters);

            return pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addParameters(PreparedStatement pstmt, Object[] parameters) {

        int index = 1;

        try {
            for (Object p : parameters) {

                if (p instanceof String) {
                    pstmt.setString(index, (String) p);
                }

                if (p instanceof Integer) {
                    pstmt.setInt(index, (Integer) p);
                }

                if (p instanceof Long) {
                    pstmt.setLong(index, (Long) p);
                }

                if (p instanceof Date) {
                    pstmt.setDate(index, (Date) p);
                }

                if (p instanceof Clob) {
                    pstmt.setClob(index, (Clob) p);
                }
                index++;
            }
        } catch (SQLException e) {
            System.out.println("Error at param in index: " + index);
            throw new RuntimeException(e);
        }

    }
}
