package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Details {
    //private static String LOAD_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/Truck_Management";
    private static String USER_NAME = "root";
    private static String PASSWORD = "12345678";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
    }


}
