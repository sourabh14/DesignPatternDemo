package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystemMediator;

public class NewButton extends CoolingSystemDevice {

    public NewButton(Mediator mediator) {
        super(mediator);
    }

    public void press() {
        mediator.pressButton();
    }
}
