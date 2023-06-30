package com.example.DesignPatternDemo.BehavioralPatterns.StatePattern;

public interface PackageState {
    void next(Package pkg);

    void prev(Package pkg);

    void printState();
}
