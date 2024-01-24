package com.example.DesignPatternDemo.CreationalPattern.FactoryPattern;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else {
            return new Rectangle();
        }
    }
}
