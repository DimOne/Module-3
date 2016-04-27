package com.epam.mentoring.Module_3.part_2;

import java.util.HashMap;
import java.util.Map;

public class Aircraft {

    private int weight;
    private double distance;
    private String model;
    protected Map <String, String> resultList = new HashMap<>();

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

    public Map<String,String> getListParams() {
        return resultList;
    }
}

