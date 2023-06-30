package com.example.DesignPatternDemo.BehavioralPatterns.StatePattern;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printState() {
        System.out.println("Package Delivered");
    }
}
