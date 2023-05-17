package com.learntocode;
import java.util.*;
import java.util.Scanner;

public class UserInterface {
    private double maxPrice;
    private double minPrice;
    private Dealership dealership;



    public UserInterface(Dealership dealership) {
        this.dealership = dealership;

    }

    public void Display() {
        init();

        try {
            menu();

        } catch (Exception e) {
            System.out.println("Error");

        }


    }

    private void init() {
        dealership = new Dealership(dealership.getName(), dealership.getAddress(), dealership.getPhone());
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Our Dealership");
        System.out.println("Please Choose Between 1-9");
        System.out.println("1.Search By Price");
        System.out.println("2.Search By Make/Model");
        System.out.println("3.Search By Year");
        System.out.println("4.Search By Color");
        System.out.println("5.Search By Mileage");
        System.out.println("6.Search By Vehicle Type");
        System.out.println("7.Search All Vehicles");
        System.out.println("8.Add A Vehicle");
        System.out.println("9.Remove Vehicle");
        System.out.println("99.Exit Home");


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please Enter Maximum price");
                double maxPrice = scanner.nextDouble();

                System.out.println("Please Enter Minimum Price");
                double minPrice = scanner.nextDouble();
             processGetByPriceRequest(dealership.getAllVehicles());
                break;

            case 2:
                System.out.println("Please Enter Make");
                String make = scanner.nextLine();

                System.out.println("Please Enter Model");
                String model = scanner.nextLine();
                break;

            case 3:
                System.out.println("Please Enter Vehicle Year");
                int year = scanner.nextInt();
                break;
            case 4:
                System.out.println("Enter Color of Your Choice");
                String color = scanner.nextLine();
                break;
            case 5:
                System.out.println("Please Search By Mileage");
                String mileage = scanner.nextLine();
                break;
            case 6:
                System.out.println("Please Enter Vehicle Type");
                String vehicleType = scanner.nextLine();
                break;
            case 7:
               // System.out.println("Search All Vehicles");
                processGetAllVehiclesRequest(dealership.getAllVehicles());
                System.out.println(dealership.getAllVehicles());
                break;
            case 8:
                System.out.println("Add New Vehicle");
                break;
            case 9:
                System.out.println("Remove Vehicle");
                break;
            case 99:
                System.out.println("Exit");
                break;

        }
    }

    private void displayVehicles(List<Vehicle> inventory){
        for(int i = 0; i <inventory.size();i++) {
            System.out.println(inventory.get(i));//vehicles
        }

    }

    public void proccessAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByPriceRequest(List<Vehicle> inventory) {
        List<Vehicle> selectedVehicles = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                selectedVehicles.add(vehicle);

            }
        }
        displayVehicles(selectedVehicles);

    }

    public void processGetByMakeModel(List<Vehicle> inventory) {
    }

    public void processGetByYearRequest(List<Vehicle> inventory) {

    }

    public void processGetByCOlorRequest(List<Vehicle> inventory) {

    }

    public void processGetByMileageRequest(List<Vehicle> inventory) {

    }

    public void processGetByVehicleTypeRequest(List<Vehicle> inventory) {

    }

    public void processGetAllVehiclesRequest(List<Vehicle> inventory) {
        for(int i = 0; i <inventory.size();i++) {
            System.out.println(inventory.get(i));//vehicles
    }
    }

    public void processAddVehcicleRequest(List<Vehicle> inventory) {

    }

    public void proccessRemoveVehicleRequest(List<Vehicle> inventory) {
    }




}
