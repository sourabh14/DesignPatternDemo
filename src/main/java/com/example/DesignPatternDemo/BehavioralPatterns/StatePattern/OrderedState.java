package com.example.DesignPatternDemo.BehavioralPatterns.StatePattern;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("This is the initial stage of package");
    }

    @Override
    public void printState() {
        System.out.println("Package ordered");
    }
}
