package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Printers.ConsolePrinter;

import java.util.Scanner;

public class DataProcessor {

    private String type;
    private String model;
    private long carrying_capacity;
    private int passenger_capacity;
    private int weight;
    private double distance;

    private Scanner input = new Scanner(System.in);
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

    public void addCargoJet(String type, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.nextLine();
        System.out.println("Enter carrying capacity, kg: ");
        carrying_capacity = input.nextLong();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distance, km: ");
        distance = input.nextLong();
        Cargo_jet cargo_jet = new Cargo_jet(type, model, carrying_capacity, weight, distance);
        aircompany.addAircraftToFleet(cargo_jet);
    }

    public void addPassengerJet(String type, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.nextLine();
        System.out.println("Enter passengers capacity, person: ");
        passenger_capacity = input.nextInt();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distanse, km: ");
        distance = input.nextLong();
        Passenger_jet passenger_jet = new Passenger_jet(type, model, passenger_capacity, weight, distance);
        aircompany.addAircraftToFleet(passenger_jet);
        input.close();
    }

    public void addBussinesJet(String type, Aircompany aircompany) {
        System.out.println("Enter model name: ");
        model = input.nextLine();
        System.out.println("Enter passengers capacity, person: ");
        passenger_capacity = input.nextInt();
        System.out.println("Enter weight, kg: ");
        weight = input.nextInt();
        System.out.println("Enter distanse, km: ");
        distance = input.nextLong();
        Bussines_jet bussines_jet = new Bussines_jet(type, model, passenger_capacity, weight, distance);
        aircompany.addAircraftToFleet(bussines_jet);
    }

    private void inputDataForOneMoreAircraft(Aircompany aircompany) {
        System.out.println("Do you want to enter one more aircraft?(Y/N)");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            inputAircraftData();
        } else {
            printOutFleet(aircompany);
            input.close();
            System.exit(0);
        }
    }

    public void printOutFleet(Aircompany aircompany) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        for (Aircraft aircraft : aircompany.getFleet()) {
            aircraft.print(consolePrinter);
        }
    }

}
