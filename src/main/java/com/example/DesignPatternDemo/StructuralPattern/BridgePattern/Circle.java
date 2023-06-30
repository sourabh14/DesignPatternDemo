package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public class Circle extends Shape {

    Circle(Painter painter) {
        super(painter);
    }

    @Override
    public void draw() {
        System.out.print("Painting circle.. ");
        painter.paint();
    }

}
