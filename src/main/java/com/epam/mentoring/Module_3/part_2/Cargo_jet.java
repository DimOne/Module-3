package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Formatter.Printer;

public class Cargo_jet extends Aircraft {

    private long carrying_capacity;

    public Cargo_jet(String type, String model, long carrying_capacity, int weight, double distance) {
        this.setType(type);
        this.setModel(model);
        this.setCarrying_capacity(carrying_capacity);
        this.setWeight(weight);
        this.setDistance(distance);
    }

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(long carrying_capacity) {
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
