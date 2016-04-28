package com.epam.mentoring.Module_3.part_2;

import java.util.Scanner;

public class DataProcessor {

    public void inputAircraftData() {
        String typeOfAircraft = "";

        Scanner input = new Scanner(System.in);
        Aircompany aircompany = new Aircompany();

        System.out.println("Please enter type of aircraft(cargo, passenger, bussines): ");
        typeOfAircraft = input.next();
        if (typeOfAircraft.equals("cargo")) {
            Cargo_jet cargo_jet = new Cargo_jet();
            cargo_jet.addCargoJet(cargo_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else if (typeOfAircraft.equals("passenger")) {
            Passenger_jet passenger_jet = new Passenger_jet();
            passenger_jet.addPassengerJet(passenger_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else if (typeOfAircraft.equals("business")) {
            Business_jet business_jet = new Business_jet();
            business_jet.addBussinesJet(business_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else {
            System.out.println("You entered wrong aircraft type!");
            inputDataForOneMoreAircraft();
        }
    }

    public void inputDataForOneMoreAircraft() {
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
