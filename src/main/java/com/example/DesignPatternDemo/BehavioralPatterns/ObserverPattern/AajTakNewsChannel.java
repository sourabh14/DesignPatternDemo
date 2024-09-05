package com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern;

public class AajTakNewsChannel implements NewsEventListener {

    @Override
    public void update(String news) {
        System.out.println("Setting news for aaj tak: " + news);
    }

    @Override
    public String getName() {
        return "Aaj tak, sabse tez";
    }
}
