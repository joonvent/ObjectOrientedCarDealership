package com.learntocode;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager() {
    private String dealership = "dealership.csv";

    public Dealership getDealership() {

        Dealership dealership1 = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(dealership));

            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (lineNumber == 0) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership1 = new Dealership(name, address, phone);

                } else {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership1.addVehicle(vehicle);
                }
                lineNumber++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dealership1;
    }


    public static void saveDealership(Dealership dealership) {

    }
}