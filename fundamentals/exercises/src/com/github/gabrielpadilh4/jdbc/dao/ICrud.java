package com.github.gabrielpadilh4.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface ICrud {

    Connection getConnection();

    int create(String sql, Object... parameters);

    ResultSet read(String sql, Object... parameters);

    int update(String sql, Object... parameters);

    int delete(String sql, Object... parameters);

    void addParameters(PreparedStatement pstmt, Object[] parameters);
}
