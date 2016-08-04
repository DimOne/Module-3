package com.epam.mentoring.Module_3.part_2.Aircrafts;

import com.epam.mentoring.Module_3.part_2.Formatter.Printer;
import com.epam.mentoring.Module_3.part_2.Visitiors.AircraftVisitorImpl;

public class Cargo_jet extends Aircraft {

    private int carrying_capacity;

    public Cargo_jet(String type, String model, int carrying_capacity, int weight, int distance) {
        this.setType(type);
        this.setModel(model);
        this.setCarrying_capacity(carrying_capacity);
        this.setWeight(weight);
        this.setDistance(distance);
    }

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    private void setCarrying_capacity(int carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    @Override
    public void print(Printer printer) {
        super.print(printer);
        printer.printCarryingCapacity(this.carrying_capacity);
    }

    @Override
    public void accept(AircraftVisitorImpl aircraftVisitor) {
        aircraftVisitor.visit(this);
    }
}
