package com.example.DesignPatternDemo.BehavioralPatterns.ObserverPattern;

public class NdtvNewsChannel implements NewsEventListener {

    @Override
    public void update(String news) {
        System.out.println("Setting news for Ndtv: " + news);
    }

    @Override
    public String getName() {
        return "Ndtv, sabse aage";
    }

}
