package com.epam.mentoring.Module_3.part_2.aircrafts;

import com.epam.mentoring.Module_3.part_2.formatter.Printer;
import com.epam.mentoring.Module_3.part_2.visitiors.AircraftProcessor;

public class CargoJet extends Aircraft {

    private final int carrying_capacity;

    public CargoJet(String type, String model, int carrying_capacity, int weight, int distance) {
        super(weight, distance, model, type);
        this.carrying_capacity = carrying_capacity;
    }

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    @Override
    public void print(Printer printer) {
        super.print(printer);
        printer.printCarryingCapacity(this.carrying_capacity);
    }

    @Override
    public void accept(AircraftProcessor aircraftVisitor) {
        aircraftVisitor.visit(this);
    }
}
