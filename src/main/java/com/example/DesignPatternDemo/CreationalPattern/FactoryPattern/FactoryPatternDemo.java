package com.example.DesignPatternDemo.CreationalPattern.FactoryPattern;

import java.util.Scanner;

public class FactoryPatternDemo {

    public void execute() {
        System.out.println("--Factory pattern demo--");
        // Take input of shape type
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a shape: ");
//        String shapeType = scanner.nextLine();

        String shapeType = "square";


        // Create shape based on type
        // If a new shape is added then the client code (FactoryPatternDemo.java) won't change
        // Object creation logic is now
        Shape shape = new ShapeFactory().createShape(shapeType);

        // Draw the shape
        shape.draw();
        System.out.println("\n");
    }
}
