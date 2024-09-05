package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public abstract class CoolingSystemDevice {
    Mediator mediator;

    public CoolingSystemDevice(Mediator mediator) {
        this.mediator = mediator;
    }
}
