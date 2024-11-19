package org.example;

public class Truck {
    private int Id;
    private String Name;
    private String Model;
    private int Capacity;
    private String Driver_Name;

    Truck(){

    }

    public Truck( String name, String model, int capacity, String driver_Name) {

        Name = name;
        Model = model;
        Capacity = capacity;
        Driver_Name = driver_Name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }

    public int getCapacity() {
        return Capacity;
    }

    public String getDriver_Name() {
        return Driver_Name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setDriver_Name(String driver_Name) {
        Driver_Name = driver_Name;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Model='" + Model + '\'' +
                ", Capacity=" + Capacity +
                ", Driver_Name=" + Driver_Name +
                '}';
    }
}
