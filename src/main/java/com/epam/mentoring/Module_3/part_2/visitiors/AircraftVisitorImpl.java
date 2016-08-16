package com.epam.mentoring.Module_3.part_2.visitiors;

import com.epam.mentoring.Module_3.part_2.aircrafts.BussinesJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.CargoJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.PassengerJet;

public class AircraftVisitorImpl implements AircraftProcessor {

    private long carrying_capacity;
    private int passenger_capacity;

    public long getCarrying_capacity() {
        return carrying_capacity;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    @Override
    public void visit(CargoJet cargo_jet) {
        carrying_capacity += cargo_jet.getCarrying_capacity();
    }

    @Override
    public void visit(PassengerJet passenger_jet) {
        passenger_capacity += passenger_jet.getPassenger_capacity();
    }

    @Override
    public void visit(BussinesJet bussines_jet) {
        passenger_capacity += bussines_jet.getPassenger_capacity();
    }
}
