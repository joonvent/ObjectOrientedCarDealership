package com.learntocode;

import java.util.Scanner;

public class UserInterface {

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


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please Enter Maximum price");
                double maxPrice = scanner.nextDouble();

                System.out.println("Please Enter Minimum Price");
                double minPrice = scanner.nextDouble();
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
                System.out.println("Search All Vehicles");
                break;
            case 8:
                System.out.println("Add New Vehicle");
                break;
            case 9:
                System.out.println("Remove Vehicle");

        }



    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModel() {
    }

    public void processGetByYearRequest() {

    }

    public void processGetByCOlorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehcicleRequest() {

    }

    public void proccessRemoveVehicleRequest() {
    }

}
