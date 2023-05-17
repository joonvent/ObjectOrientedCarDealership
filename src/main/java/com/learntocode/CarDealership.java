package com.learntocode;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
  //  private UserInterface userInterface;
    private Dealership dealership;
    private ArrayList<Vehicle> inventory;

    public static void main(String[] args) {
        Dealership dealership =new Dealership("DealerShip", "156-09 Green St","718-990-8976");
        UserInterface userInterface = new UserInterface(dealership);
        System.out.println(userInterface);
        userInterface.Display();

    }
}

