package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public class NewFan extends CoolingSystemDevice {
    private boolean isOn = false;

    public NewFan(Mediator mediator) {
        super(mediator);
    }

    public void start() {
        mediator.startPowerSupply();
        System.out.println("Starting Fan");
        isOn = true;
    }

    public void stop() {
        System.out.println("Stopping Fan");
        isOn = false;
        mediator.stopPowerSupply();
    }

    public boolean isOn() {
        return isOn;
    }

}
