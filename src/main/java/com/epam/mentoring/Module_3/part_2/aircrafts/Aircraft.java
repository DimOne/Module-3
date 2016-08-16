package com.epam.mentoring.Module_3.part_2.aircrafts;

import com.epam.mentoring.Module_3.part_2.formatter.Printer;
import com.epam.mentoring.Module_3.part_2.visitiors.AircraftProcessor;

public abstract class Aircraft {

    private final int weight;
    private final int distance;
    private final String model;
    private final String type;

    protected Aircraft(int weight, int distance, String model, String type) {
        this.weight = weight;
        this.distance = distance;
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public String getModel() {
        return model;
    }

    public void print(Printer formatter) {
        formatter.printModel(this.model);
        formatter.printType(this.type);
        formatter.printWeight(this.weight);
        formatter.printDistance(this.distance);
    }

    public abstract void accept(AircraftProcessor aircraftVisitor);
}

