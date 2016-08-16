package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.aircrafts.Aircraft;
import com.epam.mentoring.Module_3.part_2.aircrafts.BussinesJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.CargoJet;
import com.epam.mentoring.Module_3.part_2.aircrafts.PassengerJet;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {

    private List<CargoJet> cargo_jets = new ArrayList<>();
    private List<PassengerJet> passenger_jets = new ArrayList<>();
    private List<BussinesJet> bussines_jets = new ArrayList<>();
    private List<Aircraft> aircrafts = new ArrayList<>();

    public void addAircraftToFleet(CargoJet cargo_jet) {
        cargo_jets.add(cargo_jet);
    }

    public void addAircraftToFleet(PassengerJet passenger_jet) {
        passenger_jets.add(passenger_jet);
    }

    public void addAircraftToFleet(BussinesJet bussines_jet) {
        bussines_jets.add(bussines_jet);
    }

    public List<CargoJet> getCargo_jets() {
        return cargo_jets;
    }

    public List<PassengerJet> getPassenger_jets() {
        return passenger_jets;
    }

    public List<BussinesJet> getBussines_jets() {
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
