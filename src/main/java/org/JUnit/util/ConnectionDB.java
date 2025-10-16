package org.JUnit.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/arquitetura_mvsr";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlPW";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
