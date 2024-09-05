package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2;

public class Restaurant implements Client {
    private String name;
    private String address;

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant();
    }

}
