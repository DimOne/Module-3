package com.epam.mentoring.Module_3.part_2.visitiors;

import com.epam.mentoring.Module_3.part_2.aircrafts.BussinesJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.CargoJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.PassengerJet;

public interface AircraftProcessor {
    void visit(CargoJet cargo_jet);
    void visit(PassengerJet passenger_jet);
    void visit(BussinesJet bussines_jet);
}
