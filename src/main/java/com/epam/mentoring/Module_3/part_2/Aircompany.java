package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Aircrafts.Aircraft;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Bussines_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Cargo_jet;
import com.epam.mentoring.Module_3.part_2.Aircrafts.Passenger_jet;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {

    private List<Cargo_jet> cargo_jets = new ArrayList<>();
    private List<Passenger_jet> passenger_jets = new ArrayList<>();
    private List<Bussines_jet> bussines_jets = new ArrayList<>();
    private List<Aircraft> aircrafts = new ArrayList<>();

    public void addAircraftToFleet(Cargo_jet cargo_jet) {
        cargo_jets.add(cargo_jet);
    }

    public void addAircraftToFleet(Passenger_jet passenger_jet) {
        passenger_jets.add(passenger_jet);
    }

    public void addAircraftToFleet(Bussines_jet bussines_jet) {
        bussines_jets.add(bussines_jet);
    }

    public List<Cargo_jet> getCargo_jets() {
        return cargo_jets;
    }

    public List<Passenger_jet> getPassenger_jets() {
        return passenger_jets;
    }

    public List<Bussines_jet> getBussines_jets() {
        return bussines_jets;
    }

    public void gatherAllPlanes() {
        aircrafts.addAll(cargo_jets);
        aircrafts.addAll(passenger_jets);
        aircrafts.addAll(bussines_jets);
    }

    public List<Aircraft> getAllAircrafts() {
        return aircrafts;
    }
}
