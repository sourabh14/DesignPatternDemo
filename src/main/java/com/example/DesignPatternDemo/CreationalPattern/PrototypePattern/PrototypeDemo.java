package com.example.DesignPatternDemo.CreationalPattern.PrototypePattern;

public class PrototypeDemo {

    public void execute() {
        System.out.println("--Prototype pattern demo--");

        User u1 = new User(1, "name1");
        System.out.println("user 1: " + u1.toString());

        // Prototype pattern lets you copy existing objects without making
        // your code dependent on their classes.
        // An object that supports cloning is called a prototype.

        // The Java.lang.Cloneable interface is a marker interface.
        // There is a method clone() in the Object class. Cloneable interface is implemented by a class to make Object.clone() method valid thereby making field-for-field copy.
        User u2 = u1.clone();
        System.out.println("user 1: " + u2.toString());

        // Usage:
        //  1. Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
        //  2. 
    }
}
