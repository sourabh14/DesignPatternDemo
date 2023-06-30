package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public class Square extends Shape {

    Square(Painter painter) {
        super(painter);
    }

    @Override
    public void draw() {
        System.out.print("Painting square.. ");
        painter.paint();
    }

}
