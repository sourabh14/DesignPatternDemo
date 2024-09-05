package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public class NewPowerSupply extends CoolingSystemDevice {
    private boolean isOn = false;

    public NewPowerSupply(Mediator mediator) {
        super(mediator);
    }

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
