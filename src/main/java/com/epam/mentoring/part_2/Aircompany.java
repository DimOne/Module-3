package com.epam.mentoring.part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aircompany {

    public void addAircraftToFleet(Aircraft aircraft) {
        List<Aircraft> fleet = new ArrayList<Aircraft>();
        fleet.add(aircraft);
    }

    public void addingOneMoreAircraft(Aircraft aircraft) {
        String answer = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to enter one more aircraft?(Y/N)");
        answer = in.next();
        if (answer.equals("Y")) {

        }
    }

}
