package com.epam.mentoring.Module_3.part_2;

import java.util.Scanner;

public class Business_jet extends Aircraft {

    private int passenger_capacity;

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public void addBussinesJet(Business_jet bussines_jet, Aircompany aircompany) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter model name: ");
            bussines_jet.setModel(input.nextLine());
            System.out.println("Enter passengers capacity, person: ");
            bussines_jet.setPassenger_capacity(input.nextInt());
            System.out.println("Enter weight, kg: ");
            bussines_jet.setWeight(input.nextInt());
            System.out.println("Enter distanse, km: ");
            bussines_jet.setDistance(input.nextLong());
            aircompany.addAircraftToFleet(bussines_jet);
        }
    }
}
