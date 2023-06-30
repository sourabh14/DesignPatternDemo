package com.example.DesignPatternDemo.StructuralPattern.AdapterPattern;

// Adapts FirefoxDriver to a WebDriver
public class WebDriverAdapter implements IWebDriver {

    FirefoxDriver firefoxDriver;

    WebDriverAdapter(FirefoxDriver firefoxDriver) {
        this.firefoxDriver = firefoxDriver;
    }

    @Override
    public void getElement() {
        firefoxDriver.findElement();
    }

    @Override
    public void selectElement() {
        firefoxDriver.clickElement();
    }
}
