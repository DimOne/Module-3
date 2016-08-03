package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Formatter.ConsolePrinter;

import java.util.Collections;
import java.util.Scanner;

public class DataProcessor {

    private String model;
    private int carrying_capacity;
    private int passenger_capacity;
    private int weight;
    private int distance;

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private Aircompany aircompany = new Aircompany();


    public void inputAircraftData() {
        System.out.println("Please enter type of aircraft(cargo, passenger, bussines): ");
        String typeOfAircraft = input.next();
        if (typeOfAircraft.equals("cargo")) {
            addCargoJet(typeOfAircraft, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else if (typeOfAircraft.equals("passenger")) {
            addPassengerJet(typeOfAircraft, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else if (typeOfAircraft.equals("bussines")) {
            addBussinesJet(typeOfAircraft, aircompany);
            inputDataForOneMoreAircraft(aircompany);
        } else {
            System.out.println("You entered wrong aircraft type!");
            inputDataForOneMoreAircraft(aircompany);
        }
    }

    private void addCargoJet(String typeOfAircraft, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.next();
        System.out.println("Enter carrying capacity, kg: ");
        carrying_capacity = input.nextInt();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distance, km: ");
        distance = input.nextInt();
        Cargo_jet cargo_jet = new Cargo_jet(typeOfAircraft, model, carrying_capacity, weight, distance);
        aircompany.addAircraftToFleet(cargo_jet);
    }

    private void addPassengerJet(String typeOfAircraft, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.next();
        System.out.println("Enter passengers capacity, person: ");
        passenger_capacity = input.nextInt();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distanse, km: ");
        distance = input.nextInt();
        Passenger_jet passenger_jet = new Passenger_jet(typeOfAircraft, model, passenger_capacity, weight, distance);
        aircompany.addAircraftToFleet(passenger_jet);
    }

    private void addBussinesJet(String typeOfAircraft, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.next();
        System.out.println("Enter passengers capacity, person: ");
        passenger_capacity = input.nextInt();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distanse, km: ");
        distance = input.nextInt();
        Bussines_jet bussines_jet = new Bussines_jet(typeOfAircraft, model, passenger_capacity, weight, distance);
        aircompany.addAircraftToFleet(bussines_jet);
    }

    private void inputDataForOneMoreAircraft(Aircompany aircompany) {
        System.out.println("Do you want to enter one more aircraft?(Y/N)");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            inputAircraftData();
        } else if (answer.equalsIgnoreCase("N")) {
            printOutFleet(aircompany);
            overallCarrayingAndPassengerCapacity(aircompany);
            input.close();
            System.exit(0);
        }
    }

    private void printOutFleet(Aircompany aircompany) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        for (Aircraft aircraft : aircompany.getFleet()) {
            aircraft.print(consolePrinter);
        }
    }

    private void overallCarrayingAndPassengerCapacity(Aircompany aircompany) {
        AircraftVisitorImpl aircraftVisitor = new AircraftVisitorImpl();
        for (Aircraft aircraft : aircompany.getFleet()) {
            aircraft.accept(aircraftVisitor);
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Overall carrying capacity, kg: " + aircraftVisitor.getCarrying_capacity());
        System.out.println("Overall passenger capacity, person: " + aircraftVisitor.getPassenger_capacity());
        System.out.println("------------------------------------------------------------------------------");
        sortAircraftsByDistance(aircompany);
    }

    private void sortAircraftsByDistance(Aircompany aircompany) {
        Collections.sort(aircompany.getFleet(), new AircraftComparator());
        System.out.println("Sorted by distance, km: ");
        System.out.println("-------------------------------------------------------------------------------");
        printOutFleet(aircompany);
    }
}
