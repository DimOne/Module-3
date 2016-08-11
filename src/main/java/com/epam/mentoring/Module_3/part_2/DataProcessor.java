package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Aircrafts.Aircraft;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Bussines_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Cargo_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Passenger_jet;
import com.epam.mentoring.Module_3.part_2.Formatter.ConsolePrinter;
import com.epam.mentoring.Module_3.part_2.Visitiors.AircraftVisitorImpl;
import com.epam.mentoring.Module_3.part_3.WrongVariantExeption;

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
        switch (typeOfAircraft) {
            case "cargo":
                try {
                    addCargoJet(typeOfAircraft, aircompany);
                } catch (WrongVariantExeption wrongVariantExeption) {
                    System.out.println("You entered invalid value! Would you like reenter it?(Y/N)");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("Y")) {
                        inputAircraftData();
                    } else if (answer.equalsIgnoreCase("N")) {
                        input.close();
                        System.exit(0);
                    }
                }
                inputDataForOneMoreAircraft(aircompany);
                break;
            case "passenger":
                addPassengerJet(typeOfAircraft, aircompany);
                inputDataForOneMoreAircraft(aircompany);
                break;
            case "bussines":
                addBussinesJet(typeOfAircraft, aircompany);
                inputDataForOneMoreAircraft(aircompany);
                break;
            default:
                System.out.println("You entered wrong aircraft type!");
                inputDataForOneMoreAircraft(aircompany);
                break;
        }
    }

    private void addCargoJet(String typeOfAircraft, Aircompany aircompany) throws WrongVariantExeption {
        System.out.println("Enter model name: ");
        model = input.next();
        System.out.println("Enter carrying capacity, kg: ");
        carrying_capacity = input.nextInt();
        if (carrying_capacity <= 0) throw new WrongVariantExeption();
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
            aircompany.gatherAllPlanes();
            printOutFleet(aircompany);
            overallCarrayingAndPassengerCapacity(aircompany);
            input.close();
            System.exit(0);
        }
    }

    private void printOutFleet(Aircompany aircompany) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        for (Aircraft aircraft : aircompany.getAllAircrafts()) {
            aircraft.print(consolePrinter);
        }
    }

    private void overallCarrayingAndPassengerCapacity(Aircompany aircompany) {
        AircraftVisitorImpl aircraftVisitor = new AircraftVisitorImpl();
        for (Aircraft aircraft : aircompany.getAllAircrafts()) {
            aircraft.accept(aircraftVisitor);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Overall carrying capacity, kg: " + aircraftVisitor.getCarrying_capacity());
        System.out.println("Overall passenger capacity, person: " + aircraftVisitor.getPassenger_capacity());
        System.out.println("-------------------------------------------------------------------------------");
        sortAircraftsByDistance(aircompany);
    }

    private void sortAircraftsByDistance(Aircompany aircompany) {
        Collections.sort(aircompany.getAllAircrafts(), new AircraftComparator());
        System.out.println("Sorted by distance, km: ");
        System.out.println("-------------------------------------------------------------------------------");
        printOutFleet(aircompany);
        System.out.println("-------------------------------------------------------------------------------");
        enteringSearchAttributes(aircompany);
    }

    private void enteringSearchAttributes(Aircompany aircompany) {
        System.out.println("What type of aircraft you would like search to? (cargo, passenger, bussines)");
        String typeOfAircraft = input.next();
        switch (typeOfAircraft) {
            case "cargo":
                System.out.println("Enter carrying capacity, kg: ");
                carrying_capacity = input.nextInt();
                System.out.println("Enter distance, km: ");
                distance = input.nextInt();
                searchCargoAircraft(aircompany, carrying_capacity, distance);
                break;
            case "passenger":
                System.out.print("Enter passenger capacity, persons: ");
                passenger_capacity = input.nextInt();
                System.out.println("Enter distance, km: ");
                distance = input.nextInt();
                searchPassengerAircraft(aircompany, passenger_capacity, distance);
                break;
            case "bussines":
                System.out.print("Enter passenger capacity, persons: ");
                passenger_capacity = input.nextInt();
                System.out.println("Enter distance, km: ");
                distance = input.nextInt();
                searchBussinesAircraft(aircompany, passenger_capacity, distance);
                break;
            default:
                System.out.println("You entered wrong aircraft type!");
                break;
        }
    }

    private void searchCargoAircraft(Aircompany aircompany, int carrying_capacity, int distance) {
        for (Cargo_jet cargo_jet : aircompany.getCargo_jets()) {
            if (cargo_jet.getCarrying_capacity() == carrying_capacity && cargo_jet.getDistance() == distance) {
                System.out.println("Search results for carrying capacity = " + carrying_capacity + "kg and distance = " + distance + "km : ");
                System.out.println("-------------------------------------------------------------------------------");
                cargo_jet.print(new ConsolePrinter());
                System.out.println("-------------------------------------------------------------------------------");
            } else {
                System.out.println("Unfortunatelly, aircompany doesn't have jets according to your criterias.");
                System.exit(1);
            }
        }
    }

    private void searchPassengerAircraft(Aircompany aircompany, int passenger_capacity, int distance) {
        for (Passenger_jet passenger_jet : aircompany.getPassenger_jets()) {
            if (passenger_jet.getPassenger_capacity() == passenger_capacity && passenger_jet.getDistance() == distance) {
                System.out.println("Search results for passenger capacity = " + passenger_capacity + "persons and distance = " + distance + "km : ");
                System.out.println("-------------------------------------------------------------------------------");
                passenger_jet.print(new ConsolePrinter());
                System.out.println("-------------------------------------------------------------------------------");
            } else {
                System.out.println("Unfortunatelly, aircompany doesn't have jets according to your criterias.");
                System.exit(1);
            }
        }
    }

    private void searchBussinesAircraft(Aircompany aircompany, int passenger_capacity, int distance) {
        for (Bussines_jet bussines_jet : aircompany.getBussines_jets()) {
            if (bussines_jet.getPassenger_capacity() == passenger_capacity && bussines_jet.getDistance() == distance) {
                System.out.println("Search results for passenger capacity = " + passenger_capacity + "persons and distance = " + distance + "km : ");
                System.out.println("-------------------------------------------------------------------------------");
                bussines_jet.print(new ConsolePrinter());
                System.out.println("-------------------------------------------------------------------------------");
            } else {
                System.out.println("Unfortunatelly, aircompany doesn't have jets according to your criterias.");
                System.exit(1);
            }
        }
    }
}
