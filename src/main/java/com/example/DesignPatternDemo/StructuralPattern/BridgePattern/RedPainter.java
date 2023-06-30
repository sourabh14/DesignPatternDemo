package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public class RedPainter implements Painter {
    @Override
    public void paint() {
        System.out.println("with red colour");
    }
}
