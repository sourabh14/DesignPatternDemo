package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public abstract class Shape {

    Painter painter;

    Shape(Painter painter) {
        this.painter = painter;
    }

    abstract void draw();

}
