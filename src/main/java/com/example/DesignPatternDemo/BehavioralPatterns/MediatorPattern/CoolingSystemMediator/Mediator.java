package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public interface Mediator {
    void addButton(NewButton button);

    void addFan(NewFan fan);

    void addPowerSupply(NewPowerSupply powerSupply);

    void pressButton();

    void startPowerSupply();

    void stopPowerSupply();
}
