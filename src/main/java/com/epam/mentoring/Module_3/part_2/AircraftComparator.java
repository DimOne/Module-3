package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Aircrafts.Aircraft;

import java.util.Comparator;

public class AircraftComparator implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getDistance() - o2.getDistance();
    }
}
