package com.example.DesignPatternDemo.BehavioralPatterns.MediatorPattern.CoolingSystem;

public class Button {
    Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        System.out.println("Button pressed");
        if (fan.isOn()) {
            fan.stop();
        } else {
            fan.start();
        }
    }

}
