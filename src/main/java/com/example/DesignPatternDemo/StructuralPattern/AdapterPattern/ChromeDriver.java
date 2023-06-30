package com.example.DesignPatternDemo.StructuralPattern.AdapterPattern;

public class ChromeDriver implements IWebDriver {
    @Override
    public void getElement() {
        System.out.println("chrome get element");
    }

    @Override
    public void selectElement() {
        System.out.println("chrome select element");
    }
}
