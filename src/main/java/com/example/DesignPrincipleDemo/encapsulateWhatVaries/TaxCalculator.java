package com.example.DesignPrincipleDemo.encapsulateWhatVaries;

public class TaxCalculator {
    /*
        If tax calculation logic becomes too complex, it's easier to move it to separate class
     */
    public double getTaxRate(String country) {
        if (country.equals("US")) {
            return 0.07;
        } else if (country.equals("EU")) {
            return 0.20;
        }
        return 1.0;
    }

}
