package com.example.DesignPatternDemo.BehavioralPatterns.StatePattern;

public class Package {
    private int id;
    private String name;
    private PackageState state;

    public Package(int id, String name) {
        this.id = id;
        this.name = name;
        this.state = new OrderedState();
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void nextState() {
        this.state.next(this);
    }

    public void prevState() {
        this.state.prev(this);
    }

    public void printPackage() {
        System.out.print("[id: " + id + ", name: " + name + ", state: ");
        this.state.printState();
    }
}
