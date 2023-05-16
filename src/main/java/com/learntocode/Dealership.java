package com.learntocode;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehicleByPrice(double min, double max) {

    }

    public List<Vehicle> getVehicleByMake(String make, String model) {

    }

    public List<Vehicle> getVehicleByYear(int Year) {

    }

    public List<Vehicle> getVehicleByColor(String color) {

    }

    public List<Vehicle> getByMileage(int min, int max) {

    }

    public List<Vehicle> getByType(String vehicleType) {

    }

    public List<Vehicle> getAllVehicles() {
        return inventory;

    }


    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {

    }
}


