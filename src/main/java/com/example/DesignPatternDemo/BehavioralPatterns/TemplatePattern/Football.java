package com.example.DesignPatternDemo.BehavioralPatterns.TemplatePattern;

public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing Football Game");
    }

    @Override
    public void startPlay() {
        System.out.println("Starting Football Game");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Ended");
    }
}
