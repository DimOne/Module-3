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
            System.out.println("Enter model name: ");
            bussiness_jet.setModel(input.next());
            System.out.println("Enter passengers capacity, person: ");
            bussiness_jet.setPassenger_capacity(input.nextInt());
            System.out.println("Enter weight, kg: ");
            bussiness_jet.setWeight(input.nextInt());
            System.out.println("Enter distanse, km: ");
            bussiness_jet.setDistance(input.nextLong());
            aircompany.addAircraftToFleet(bussiness_jet);
        } else {
            System.out.println("You entered wrong aircraft type!");
        }

    }
}
