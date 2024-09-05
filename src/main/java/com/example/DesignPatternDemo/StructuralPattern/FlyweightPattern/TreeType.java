package com.example.DesignPatternDemo.StructuralPattern.FlyweightPattern;

import java.util.Objects;

public class TreeType {
    private String name;
    private String color;
    private String texture;
    private int hashCode;   // For implementing - Using a Custom Class as a Key in a Java HashMap (https://www.baeldung.com/java-custom-class-map-key)

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
        this.hashCode = Objects.hash(name, color, texture);
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        TreeType other = (TreeType)o;
        if (this.name != other.name) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.texture != other.texture) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                ", hashCode=" + hashCode +
                '}';
    }

    /*
        TreeType is a flyweight class. It contains a portion of the state of a tree. These fields
        store values that are unique for each particular tree. For instance, you won't find here the
        tree coordinates. But the texture and colors shared between many trees are here.

        Since this data is usually BIG, you'd waste a lot of memory by keeping it in each tree object.
        Instead, we can extract texture, color and other repeating data into a separate object which
        lots of individual tree objects can reference.
     */


}
