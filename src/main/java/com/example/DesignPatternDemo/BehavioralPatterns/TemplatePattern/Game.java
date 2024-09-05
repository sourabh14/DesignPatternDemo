package com.example.DesignPatternDemo.BehavioralPatterns.TemplatePattern;

public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    // play method is declared as final to prevent it from being overriden
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
