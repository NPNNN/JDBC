package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
    public final static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public final static String URL="jdbc:mysql://localhost:3306/Maven";
    public final static String USER_NAME="root";
    public final static String PASSWORD="12345678";

    public static void main(String[] args) {
        try {
            Class.forName(LOAD_DRIVER);

            //Making connetion
            Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            //create statement
            Statement statement = connection.createStatement();


            //create query
            String query = "delete from maven where Id=101";
            int rowAffected = statement.executeUpdate(query);
            System.out.println("RowAffected:  " +rowAffected);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    }
