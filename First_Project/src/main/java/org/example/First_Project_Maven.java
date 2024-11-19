package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.lang.Class.forName;

public class First_Project_Maven {
    public final static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public final static String URL="jdbc:mysql://localhost:3306/Maven";
    public final static String USER_NAME="root";
    public final static String PASSWORD="12345678";

    public static void main(String[] args)  {
        try {
            Class.forName(LOAD_DRIVER);

            //Making connetion
            Connection connection =  DriverManager.getConnection(URL,USER_NAME,PASSWORD);

            //create statement
             Statement statement = connection.createStatement();


             //create query
            String query = "select * from maven";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println(id+ " " + name + " " + address);


            }



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
