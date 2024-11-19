package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Truck_Service {
    public void add(Truck truck) {
        String sql ="insert into Truck (Name,Model,Capacity,Driver_Name)values(?,?,?,?)";
        try {
            Connection connection = Connection_Details.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getCapacity());
            preparedStatement.setString(4, truck.getDriver_Name());

            int update = preparedStatement.executeUpdate();
            System.out.println("Row Inserted  " +update);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Truck getTruckById(int Id)
    {
        String sql="select * from Truck where Id = ?";
        Truck truck=new Truck();
        try {
            Connection connection = Connection_Details.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, Id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                truck.setId(resultSet.getInt("Id"));
                truck.setName(resultSet.getString("Name"));
                truck.setModel(resultSet.getString("Model"));
                truck.setCapacity(resultSet.getInt("Capacity"));
                truck.setDriver_Name(resultSet.getString("Driver_Name"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return truck;

    }
    public void UpdateTruck(Truck truck) {
        String sql = "update truck set name = ?, model = ?, capacity = ?, driver_name = ? where id= ?";
        try {
            Connection connection = Connection_Details.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, truck.getName());
            preparedStatement.setString(2, truck.getModel());
            preparedStatement.setInt(3, truck.getCapacity());
            preparedStatement.setString(4, truck.getDriver_Name());
            preparedStatement.setInt(5, truck.getId());

            int update = preparedStatement.executeUpdate();
            System.out.println("row updated : " + update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public List<Truck> getAllTrucks()
        {
            String sql="select * from truck";
            List<Truck> trucks=new ArrayList<Truck>();
            try{
                Connection connection = Connection_Details.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next())
                {
                    Truck truck=new Truck();
                    truck.setId(resultSet.getInt("id"));
                    truck.setName(resultSet.getString("name"));
                    truck.setModel(resultSet.getString("model"));
                    truck.setCapacity(resultSet.getInt("capacity"));
                    truck.setDriver_Name(resultSet.getString("driver_name"));
                    trucks.add(truck);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            return trucks;
        }

    public void deleteTruck(int id)
    {
        String deleteQuery="delete from truck where id= ?";
        try {
            Connection connection = Connection_Details.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1,id);
            int update = preparedStatement.executeUpdate();
            System.out.println("Row Deleted : "+update);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
