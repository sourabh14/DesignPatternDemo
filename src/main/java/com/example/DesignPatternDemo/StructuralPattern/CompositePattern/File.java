package com.example.DesignPatternDemo.StructuralPattern.CompositePattern;

public class File implements Component {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

}
