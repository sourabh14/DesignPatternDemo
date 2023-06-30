package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem;

public class PowerSupply {
    private boolean isOn = false;

    public void start() {
        System.out.println("Starting Power supply");
        isOn = true;
    }

    public void stop() {
        System.out.println("Stopping Power supply");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
