package com.epam.mentoring.part_2;

import java.util.Scanner;

public class Passenger_jet extends Aircraft {

    private int passenger_capacity;

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public void addPassengerJet(Passenger_jet passenger_jet, Aircompany aircompany) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter model name: ");
        passenger_jet.setModel(input.next());
        System.out.println("Enter passengers capacity, person: ");
        passenger_jet.setPassenger_capacity(input.nextInt());
        System.out.println("Enter weight, kg: ");
        passenger_jet.setWeight(input.nextInt());
        System.out.println("Enter distanse, km: ");
        passenger_jet.setDistance(input.nextLong());
        aircompany.addAircraftToFleet(passenger_jet);
    }

}
