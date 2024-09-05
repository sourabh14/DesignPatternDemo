package com.example.DesignPatternDemo.StructuralPattern.AdapterPattern;

public class FirefoxDriver {

    // analogous to getElement of chrome
    public void findElement() {
        System.out.println("firefox find element");
    }

    // analogous to selectElement of chrome
    public void clickElement() {
        System.out.println("firefox click element");
    }
}
