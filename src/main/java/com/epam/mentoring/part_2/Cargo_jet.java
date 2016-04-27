package com.epam.mentoring.part_2;

import java.util.Scanner;

public class Cargo_jet extends Aircraft {

    private long carrying_capacity;

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(long carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    public void addCargoJet(Cargo_jet cargo_jet, Aircompany aircompany) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter model name: ");
        String model = input.nextLine();
        cargo_jet.setModel(model);
        System.out.println("Enter carrying capacity, kg: ");
        cargo_jet.setCarrying_capacity(input.nextLong());
        System.out.println("Enter weight, kg: ");
        cargo_jet.setWeight(input.nextInt());
        System.out.println("Enter distanse, km: ");
        cargo_jet.setDistance(input.nextLong());
        aircompany.addAircraftToFleet(cargo_jet);
        input.close();
    }

}
