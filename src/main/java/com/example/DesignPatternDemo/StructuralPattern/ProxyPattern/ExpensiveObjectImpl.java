package com.example.DesignPatternDemo.StructuralPattern.ProxyPattern;

public class ExpensiveObjectImpl implements ExpensiveObject {

    ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading heavy initial config.. ");
    }

    @Override
    public void process() {
        System.out.println("Processing complete.. ");
    }


}
