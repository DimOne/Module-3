package com.epam.mentoring.Module_3.part_2.Visitiors;

import com.epam.mentoring.Module_3.part_2.Aircrafts.Bussines_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Cargo_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Passenger_jet;

public interface AircraftVisitor {
    void visit(Cargo_jet cargo_jet);
    void visit(Passenger_jet passenger_jet);
    void visit(Bussines_jet bussines_jet);
}
