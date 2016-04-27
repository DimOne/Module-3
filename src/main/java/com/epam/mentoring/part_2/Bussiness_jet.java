package com.epam.mentoring.part_2;

import java.util.Scanner;

public class Bussiness_jet extends Aircraft {

    private int passenger_capacity;

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public void addBussinessJet(Bussiness_jet bussiness_jet, Aircompany aircompany) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter model name: ");
        bussiness_jet.setModel(input.nextLine());
        System.out.println("Enter passengers capacity, person: ");
        bussiness_jet.setPassenger_capacity(input.nextInt());
        System.out.println("Enter weight, kg: ");
        bussiness_jet.setWeight(input.nextInt());
        System.out.println("Enter distanse, km: ");
        bussiness_jet.setDistance(input.nextLong());
        aircompany.addAircraftToFleet(bussiness_jet);
        input.close();
    }

}
