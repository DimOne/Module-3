package com.epam.mentoring.Module_3.part_2;

public interface AircraftVisitor {
    void visit(Cargo_jet cargo_jet);
    void visit(Passenger_jet passenger_jet);
}
