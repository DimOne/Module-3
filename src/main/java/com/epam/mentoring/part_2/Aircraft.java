package com.epam.mentoring.part_2;

public class Aircraft {

    private int weight;
    private int passenger_capacity;
    private double carrying_capacity;
    private double distance;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(int passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }

    public double getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(double carrying_capacity) {
        this.carrying_capacity = carrying_capacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}

