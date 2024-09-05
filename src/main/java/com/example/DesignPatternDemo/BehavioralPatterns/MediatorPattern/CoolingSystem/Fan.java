package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem;

public class Fan {
    private boolean isOn = false;
    private PowerSupply powerSupply;

    public Fan(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void start() {
        if (!powerSupply.isOn()) {
            powerSupply.start();
        }
        System.out.println("Starting Fan");
        isOn = true;
    }

    public void stop() {
        System.out.println("Stopping Fan");
        isOn = false;
        powerSupply.stop();
    }

    public boolean isOn() {
        return isOn;
    }

}
