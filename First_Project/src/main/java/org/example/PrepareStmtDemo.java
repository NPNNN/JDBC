package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class PrepareStmtDemo
{
    public final static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public final static String URL="jdbc:mysql://localhost:3306/Maven";
    public final static String USER_NAME="root";
    public final static String PASSWORD="12345678";
    public static void main( String[] args )
    {
        try {
            //load driver
            Class.forName(LOAD_DRIVER);

            //making connection
            Connection connection= DriverManager.getConnection(URL,USER_NAME,PASSWORD);

//        String query ="delete from maven where  id = ?";
//        //create statement
//         PreparedStatement prepareStatement = connection.prepareStatement(query);
//         prepareStatement.setInt(1,102);
//
//         int rowImpacted = prepareStatement.executeUpdate();
//         System.out.println(rowImpacted);

            String insertQuery = "insert into maven (Id,Name,Address) values (?,?,?)";
            PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);

            prepareStatement.setInt(1,101);
            prepareStatement.setString(2,"Narendar");
            prepareStatement.setString(3,"Parel");

            int update = prepareStatement.executeUpdate();
            System.out.println("row impacted : "+update);

            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
