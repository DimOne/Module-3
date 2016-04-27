package com.epam.mentoring.part_2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        String typeOfAircraft = " ";

        Scanner input = new Scanner(System.in);
        Aircompany aircompany = new Aircompany();

        System.out.println("Please enter type of aircraft(cargo, passenger, bussines): ");
        typeOfAircraft = input.next();

        if (typeOfAircraft.equals("cargo")) {
            Cargo_jet cargo_jet = new Cargo_jet();
            cargo_jet.addCargoJet(cargo_jet, aircompany);
        } else if (typeOfAircraft.equals("passenger")) {
            Passenger_jet passenger_jet = new Passenger_jet();
            passenger_jet.addPassengerJet(passenger_jet, aircompany);
        } else if (typeOfAircraft.equals("bussines")) {
            Bussiness_jet bussiness_jet = new Bussiness_jet();
            bussiness_jet.addBussinessJet(bussiness_jet, aircompany);
        } else {
            System.out.println("You entered wrong aircraft type!");
        }

    }
}
