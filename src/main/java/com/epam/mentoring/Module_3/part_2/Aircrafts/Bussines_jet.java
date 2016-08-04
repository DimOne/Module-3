package com.epam.mentoring.Module_3.part_2.Aircrafts;


import com.epam.mentoring.Module_3.part_2.Formatter.Printer;
import com.epam.mentoring.Module_3.part_2.Visitiors.AircraftVisitorImpl;

public class Bussines_jet extends Aircraft {

    private int passenger_capacity;

    public Bussines_jet(String type, String model, int passenger_capacity, int weight, int distance) {
        this.setType(type);
        this.setModel(model);
        this.setPassenger_capacity(passenger_capacity);
        this.setWeight(weight);
        this.setDistance(distance);
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    private void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    @Override
    public void print(Printer printer) {
        super.print(printer);
        printer.printPassengerCapacity(this.passenger_capacity);
    }

    @Override
    public void accept(AircraftVisitorImpl aircraftVisitor) {
        aircraftVisitor.visit(this);
    }
}
