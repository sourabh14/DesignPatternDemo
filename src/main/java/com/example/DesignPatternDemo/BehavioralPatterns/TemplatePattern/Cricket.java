package com.example.DesignPatternDemo.BehavioralPatterns.TemplatePattern;

public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Initializing Cricket Game");
    }

    @Override
    public void startPlay() {
        System.out.println("Starting Cricket Game");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Ended");
    }

}
