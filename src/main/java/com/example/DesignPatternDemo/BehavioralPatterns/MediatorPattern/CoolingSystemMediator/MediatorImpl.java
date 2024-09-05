package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public class MediatorImpl implements Mediator {
    private NewButton button;
    private NewFan fan;
    private NewPowerSupply powerSupply;

    @Override
    public void addButton(NewButton button) {
        this.button = button;
    }

    @Override
    public void addFan(NewFan fan) {
        this.fan = fan;
    }

    @Override
    public void addPowerSupply(NewPowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed");
        if (fan.isOn()) {
            fan.stop();
        } else {
            fan.start();
        }
    }

    @Override
    public void startPowerSupply() {
        if (!powerSupply.isOn()) {
            powerSupply.start();
        }
    }

    @Override
    public void stopPowerSupply() {
        if (powerSupply.isOn()) {
            powerSupply.stop();
        }
    }
}
