package com.epam.mentoring.Module_3.part_2;

import java.util.ArrayList;
import java.util.List;

public class Aircompany {

    List<Aircraft> fleet = new ArrayList<Aircraft>();

    public void addAircraftToFleet(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    public List<Aircraft> getFleet() {
        return fleet;
    }

}
