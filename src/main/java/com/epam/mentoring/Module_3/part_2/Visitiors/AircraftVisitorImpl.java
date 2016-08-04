package com.epam.mentoring.Module_3.part_2.Visitiors;

import com.epam.mentoring.Module_3.part_2.Aircrafts.Bussines_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Cargo_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Passenger_jet;

public class AircraftVisitorImpl implements AircraftVisitor {

    private long carrying_capacity;
    private int passenger_capacity;

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    @Override
    public void visit(Cargo_jet cargo_jet) {
        carrying_capacity += cargo_jet.getCarrying_capacity();
    }

    @Override
    public void visit(Passenger_jet passenger_jet) {
        passenger_capacity += passenger_jet.getPassenger_capacity();
    }

    @Override
    public void visit(Bussines_jet bussines_jet) {
        passenger_capacity += bussines_jet.getPassenger_capacity();
    }
}
