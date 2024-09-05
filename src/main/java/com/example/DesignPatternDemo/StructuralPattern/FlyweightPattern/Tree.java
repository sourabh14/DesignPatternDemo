package com.example.DesignPatternDemo.StructuralPattern.FlyweightPattern;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, String name, String color, String texture) {
        this.x = x;
        this.y = y;
        this.treeType = TreeFactory.getTreeType(name, color, texture);
    }

    public void plantTree() {
        System.out.println("Planting tree of " + treeType.toString() + ", on coordinates: " + x + ", " + y);
    }
}
