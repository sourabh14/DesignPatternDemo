package com.example.DesignPrincipleDemo.programToInterface;

public class Cat2 {
    public int energy;

    public void eatOrDrink(Food food) {
        energy += food.getNutrition();
    }
}
