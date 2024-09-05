package com.example.DesignPatternDemo.BehavioralPatterns.VisitorPattern.Example2;

public class Bank implements Client {
    private String branchName;

    public Bank(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank();
    }

}
