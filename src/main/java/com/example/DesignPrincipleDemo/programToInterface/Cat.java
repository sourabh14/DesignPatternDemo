package com.example.DesignPrincipleDemo.programToInterface;

public class Cat {
    public int energy;

    public void eatOrDrink(Milk milk) {
        energy += milk.getNutrition();
    }
}
