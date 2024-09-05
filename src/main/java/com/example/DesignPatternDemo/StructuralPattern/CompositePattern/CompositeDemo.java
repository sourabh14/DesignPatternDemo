package com.example.DesignPatternDemo.StructuralPattern.CompositePattern;

public class CompositeDemo {
    public void execute() {
        System.out.println("\n--Composite pattern demo--");
        
        /*
            Intro:
                Composite is a structural design pattern that lets you compose objects into tree structures and then
                work with these structures as if they were individual objects.

                Compose objects into tree structures to represent part-whole hierarchies.
                Composite lets clients treat individual objects and compositions of objects uniformly”:
                This means that a client should be able to apply the same operations over both aggregation
                of objects (Wholes) and individual objects (Parts).

            Example:
                Given a tree structure of files and directories. A file has a name and size.
                A directory can have several files and other directories. The size of a directory is the
                sum of component files and directories.
                The task is to find the size of any given file or directory.

                                    D1
                                  /     \
                                 F1      D2
                                        /  \
                                       D3   F3
                                      /
                                     F4

                Solution:
                    A challenge in creating such hierarchical tree structures is to provide clients a
                    uniform way to access and manipulate objects of the tree. Clients should remain unaware
                    whether any operation is being done on a leaf or a node, and this is where the composite
                    design pattern comes in.

                    The composite pattern suggests that you work with files and directories through a coommon
                    interface which declares a method for getting the total size.

                Usage:
                    - Use composite pattern when you have to implement a tree-like object structure.
                    - Use the pattern when you want the client code to treat both simple an complex elements uniformly.

         */

        File f4 = new File("f4", 10);
        Directory d3 = new Directory("d3");
        d3.addComponent(f4);

        File f3 = new File("f3", 5);
        Directory d2 = new Directory("d2");
        d2.addComponent(f3);
        d2.addComponent(d3);

        File f1 = new File("f1", 8);
        Directory d1 = new Directory("d1");
        d1.addComponent(f1);
        d1.addComponent(d2);

        System.out.println("Size of d2: " + d2.getSize());
        System.out.println("Size of f3: " + f3.getSize());
        System.out.println("Size of d3: " + d3.getSize());
        System.out.println("Size of d1: " + d1.getSize());

    }

}
