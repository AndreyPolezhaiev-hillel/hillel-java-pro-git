package com.polezhaiev.practice.exercise1;

public class Car{

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Electricity has been started");
    }

    private void startCommand(){
        System.out.println("Command has been started");
    }

    private void startFuelSystem(){
        System.out.println("Fuel System has been started");
    }

}
