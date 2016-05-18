package com.epam.mentoring.Module_3.part_2;

import com.epam.mentoring.Module_3.part_2.Formatter.Printer;

import java.util.HashMap;
import java.util.Map;

public class Aircraft implements Row{

    private int weight;
    private double distance;
    private String model;
    private String type;
    final protected Map<String, String> parameters = new HashMap<String,String>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected Map<String, String> resultList = new HashMap<>();

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
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

}

