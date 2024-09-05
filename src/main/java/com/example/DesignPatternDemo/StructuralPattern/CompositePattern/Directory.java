package com.example.DesignPatternDemo.StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {

    private String name;
    private List<Component> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Component component : components) {
            size += component.getSize();
        }
        return size;
    }

}
