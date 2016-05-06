package com.epam.mentoring.Module_3.part_2;

import java.util.Scanner;

public class DataProcessor {

    private String type;
    private String model;
    private long carrying_capacity;
    private int passenger_capacity;
    private int weight;
    private double distance;

    public void inputAircraftData() {
        String typeOfAircraft = "";

        Scanner input = new Scanner(System.in);
        Aircompany aircompany = new Aircompany();

        System.out.println("Please enter type of aircraft(cargo, passenger, bussines): ");
        typeOfAircraft = input.next();
        if (typeOfAircraft.equals("cargo")) {
            addCargoJet(typeOfAircraft, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else if (typeOfAircraft.equals("passenger")) {
            Passenger_jet passenger_jet = new Passenger_jet();
            passenger_jet.addPassengerJet(passenger_jet, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else if (typeOfAircraft.equals("business")) {
            Business_jet business_jet = new Business_jet();
            business_jet.addBussinesJet(business_jet, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else {
            System.out.println("You entered wrong aircraft type!");
            inputDataForOneMoreAircraft(aircompany);
        }
    }

    public void addCargoJet(String type, Aircompany aircompany) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter model name: ");
            String model = input.nextLine();
            System.out.println("Enter carrying capacity, kg: ");
            carrying_capacity = input.nextLong();
            System.out.println("Enter weight, kg: ");
            weight = input.nextInt();
            System.out.println("Enter distanse, km: ");
            distance = input.nextLong();
            Cargo_jet cargo_jet = new Cargo_jet(type, model, carrying_capacity, weight, distance);
            aircompany.addAircraftToFleet(cargo_jet);
        }
    }

    private void inputDataForOneMoreAircraft(Aircompany aircompany) {
        String answer = " ";

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Do you want to enter one more aircraft?(Y/N)");
            answer = input.next();
            if (answer.equalsIgnoreCase("Y")) {
                inputAircraftData();
            } else {
                System.exit(0);
            }
        }
    }

}
