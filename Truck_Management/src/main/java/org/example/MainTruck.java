package org.example;

import java.util.List;
import java.util.Scanner;

class MainTruck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Truck_Service truckService = new Truck_Service();

        while (true) {
            System.out.println("\n--- Truck Management Menu ---");
            System.out.println("1. Add Truck");
            System.out.println("2. Get Truck by ID");
            System.out.println("3. Update Truck");
            System.out.println("4. Get All Trucks");
            System.out.println("5. Delete Truck by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Add Truck
                    System.out.println("Enter truck details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Capacity: ");
                    String capacity = scanner.nextLine();
                    System.out.print("Driver Name: ");
                    String driverName = scanner.nextLine();

                    Truck newTruck = new Truck(name, model, Integer.parseInt(capacity), driverName)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ;
                    truckService.add(newTruck);
                    System.out.println("Truck added successfully.");
                    break;

                case 2:
                    // Get Truck by ID
                    System.out.print("Enter Truck ID: ");
                    int truckId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    Truck truck = truckService.getTruckById(truckId);
                    if (truck != null) {
                        System.out.println("Truck data: " + truck);
                    } else {
                        System.out.println("Truck with ID " + truckId + " not found.");
                    }
                    break;

                case 3:
                    // Update Truck
                    System.out.print("Enter Truck ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    Truck truckToUpdate = truckService.getTruckById(updateId);
                    if (truckToUpdate != null) {
                        System.out.print("Enter new Driver Name: ");
                        String newDriverName = scanner.nextLine();
                        truckToUpdate.setDriver_Name(newDriverName);
                        truckService.UpdateTruck(truckToUpdate);
                        System.out.println("Truck updated successfully.");
                    } else {
                        System.out.println("Truck with ID " + updateId + " not found.");
                    }
                    break;

                case 4:
                    // Get All Trucks
                    List<Truck> allTrucks = truckService.getAllTrucks();
                    System.out.println("All trucks in the database:");
                    for (Truck t : allTrucks) {
                        System.out.println(t);
                    }
                    break;

                case 5:
                    // Delete Truck by ID
                    System.out.print("Enter Truck ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    truckService.deleteTruck(deleteId);
                    System.out.println("Truck with ID " + deleteId + " deleted.");
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
