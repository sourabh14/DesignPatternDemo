package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2;

public class Resident implements Client {
    private String name;
    private String age;

    public Resident(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident();
    }

}
