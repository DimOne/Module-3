package com.epam.mentoring.Module_3.part_2.Aircrafts;

import com.epam.mentoring.Module_3.part_2.Formatter.Printer;
import com.epam.mentoring.Module_3.part_2.Visitiors.AircraftVisitorImpl;

public abstract class Aircraft {

    private int weight;
    private int distance;
    private String model;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print(Printer formatter) {
        formatter.printModel(this.model);
        formatter.printType(this.type);
        formatter.printWeight(this.weight);
        formatter.printDistance(this.distance);
    }

    public abstract void accept(AircraftVisitorImpl aircraftVisitor);
}
