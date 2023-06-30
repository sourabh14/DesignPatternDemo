package com.example.DesignPatternDemo.BehavioralPatterns.StrategyPattern.BirdExample;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This bird cannot fly");
    }
}
