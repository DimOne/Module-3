package com.epam.mentoring.Module_3.part_2.aircrafts;


import com.epam.mentoring.Module_3.part_2.formatter.Printer;
import com.epam.mentoring.Module_3.part_2.visitiors.AircraftProcessor;

public class BussinesJet extends Aircraft {

    private final int passenger_capacity;

    public BussinesJet(String type, String model, int passenger_capacity, int weight, int distance) {
        super(weight, distance, model, type);
        this.passenger_capacity = passenger_capacity;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    @Override
    public void print(Printer printer) {
        super.print(printer);
        printer.printPassengerCapacity(this.passenger_capacity);
    }

    @Override
    public void accept(AircraftProcessor aircraftVisitor) {
        aircraftVisitor.visit(this);
    }
}
