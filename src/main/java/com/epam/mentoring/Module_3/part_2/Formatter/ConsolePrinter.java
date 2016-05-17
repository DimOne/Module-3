package com.epam.mentoring.Module_3.part_2.Formatter;

public class ConsolePrinter implements Printer {

    @Override
    public void print() {
        System.out.print("");
    }

    @Override
    public void printType(String type) {
        System.out.print("type = " + type + " ");
    }

    @Override
    public void printModel(String model) {
        System.out.print("model = "+ model + " ");
    }

    public void printCarryingCapacity(long carrying_capacity) {
        System.out.print("carrying_capacity = " + carrying_capacity + " ");
    }

    @Override
    public void printPassengerCapacity(int passenger_capacity) {
        System.out.print("passenger_capacity = " + passenger_capacity + " ");
    }

    @Override
    public void printWeight(int weight) {
        System.out.print("weight = " + weight + " ");
    }

    @Override
    public void printDistance(double distance) {
        System.out.print("distance = " + distance + " ");
    }

}
