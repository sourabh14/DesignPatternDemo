package com.example.DesignPatternDemo.CreationalPattern.PrototypePattern;

public class PrototypeDemo {
    /*
        Intro:
            - Prototype pattern lets you copy existing objects without making your code dependent on their classes.
            - An object that supports cloning is called a prototype.

        Cloneable interface
            - The Java.lang.Cloneable interface is a marker interface.
            - There is a method clone() in the Object class. Cloneable interface is implemented by a class to make Object.clone() method valid thereby making field-for-field copy.

        Problem:
            1. Say you have an object, and you want to create an exact copy of it. We create a new object of the same
            class. Then we can through all the fields of the original object and copy their values over to the new object.
            Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields may
            be private and not visible from outside of the object itself.

            2. Since you have to know the object’s class to create a duplicate, your code becomes dependent on that class.
            Sometimes you only know the interface that the object follows, but not its concrete class, when,
            for example, a parameter in a method accepts any objects that follow some interface.

        Implementation:
            - The Prototype pattern delegates the cloning process to the actual objects that are being cloned.

        Usage:
            1. Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
     */

    public void execute() {
        System.out.println("--Prototype pattern demo--");

        User u1 = new User(1, "name1");
        System.out.println("user 1: " + u1);

        User u2 = u1.clone();
        System.out.println("user 1: " + u2.toString());


    }
}
