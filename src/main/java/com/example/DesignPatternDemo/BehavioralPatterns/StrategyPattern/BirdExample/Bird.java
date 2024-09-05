package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.BirdExample;

public class Bird {
    private String name;
    private String habitat;
    private FlyBehaviour flyBehaviour;

    public Bird(String name, String habitat, FlyBehaviour flyBehaviour) {
        this.name = name;
        this.habitat = habitat;
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly() {
        System.out.print("Bird: " + name + ", ");
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
