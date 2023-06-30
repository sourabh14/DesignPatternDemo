package com.example.DesignPatternDemo.StructuralPattern.ProxyPattern;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            // Lazy initialization
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }

}
