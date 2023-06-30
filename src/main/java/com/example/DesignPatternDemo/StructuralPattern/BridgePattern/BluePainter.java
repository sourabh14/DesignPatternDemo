package com.example.DesignPatternDemo.StructuralPattern.BridgePattern;

public class BluePainter implements Painter {
    @Override
    public void paint() {
        System.out.println("with blue colour");
    }
}
