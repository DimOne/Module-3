package com.epam.mentoring.Module_3.part_2;

import java.util.Scanner;

public class DataProcessor {

    public void inputAircraftData() {
        String typeOfAircraft = "";

        Scanner input = new Scanner(System.in);
        Aircompany aircompany = new Aircompany();

        System.out.println("Please enter type of aircraft(cargo, passenger, business): ");
        typeOfAircraft = input.next();
        if (typeOfAircraft.equals("cargo")) {
            Cargo_jet cargo_jet = new Cargo_jet();
            cargo_jet.addCargoJet(cargo_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else if (typeOfAircraft.equals("passenger")) {
            Passenger_jet passenger_jet = new Passenger_jet();
            passenger_jet.addPassengerJet(passenger_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else if (typeOfAircraft.equals("bussines")) {
            Bussines_jet bussiness_jet = new Bussines_jet();
            bussiness_jet.addBussinesJet(bussiness_jet, aircompany);
            inputDataForOneMoreAircraft();
        } else {
            System.out.println("You entered wrong aircraft type!");
            inputDataForOneMoreAircraft();
        }
    }

    public void inputDataForOneMoreAircraft() {
        String answer = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter one more aircraft?(Y/N)");
        answer = input.next();
        if (answer.equalsIgnoreCase("Y")) {
            inputAircraftData();
        } else {
            input.close();
            System.exit(0);
        }
    }

}
