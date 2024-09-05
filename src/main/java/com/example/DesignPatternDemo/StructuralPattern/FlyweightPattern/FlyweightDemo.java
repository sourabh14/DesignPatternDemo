package com.example.DesignPatternDemo.StructuralPattern.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDemo {
    public void execute() {
        System.out.println("\n--Flyweight pattern demo--");

        /*
            Flyweight pattern lets you fit more objects into the available amount of RAM by sharing
            common parts of state between multiple objects instead of keeping all the data in each object.

            Flyweight pattern is used when we need to create a large number of similar objects (say 10^5).

            Since every object consumes memory space that can be crucial for low memory devices, such as
            mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on
            memory by sharing objects. Before we apply flyweight design pattern, we need to consider following factors:
                - The number of Objects to be created by application should be huge.
                - The object creation is heavy on memory and it can be time consuming too.
                - The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program.

            Why do we care for number of objects in our program?
                - Less number of objects reduces the memory usage, and it manages to keep us away from errors related
                    to memory like java.lang.OutOfMemoryError.
                - Although creating an object in Java is really fast, we can still reduce the execution time of
                    our program by sharing objects.

            To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties.
            Intrinsic properties make the Object unique whereas extrinsic properties are set by client code and used
            to perform different operations.

            A flyweight objects essentially has two kind of attributes – intrinsic and extrinsic.
                - An intrinsic state attribute is stored/shared in the flyweight object, and it is
                    independent of flyweight’s context. As the best practice, we should make intrinsic states immutable.
                - An extrinsic state varies with flyweight’s context, which is why they cannot be shared.
                    Client objects maintain the extrinsic state, and they need to pass this to a flyweight object during object creation.

            Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them
            after creation. Each time an object is requested, the factory looks up the object in order to check if
            it's already been created. If it has, the existing object is returned – otherwise, a new one is created,
            stored and then returned.

            The flyweight object's state is made up of an invariant component shared with other similar objects (intrinsic)
            and a variant component which can be manipulated by the client code (extrinsic). It's very important that the
            flyweight objects are immutable: any operation on the state must be performed by the factory.

            Many modern applications use caches to improve response time. The flyweight pattern is similar to the core
            concept of a cache and can fit this purpose well.
         */

//        TreeType tt1 = TreeFactory.getTreeType("n1", "c1", "t1");
//        TreeFactory.printTreeTypeCache();
//        TreeType tt2 = TreeFactory.getTreeType("n1", "c1", "t1");
//        TreeFactory.printTreeTypeCache();
//        TreeType tt3 = TreeFactory.getTreeType("n3", "c3", "t3");
//        TreeFactory.printTreeTypeCache();
//        TreeType tt4 = TreeFactory.getTreeType("n1", "c1", "t1");
//        TreeFactory.printTreeTypeCache();
//
//        System.out.println("tt2 : " + tt2);
//        System.out.println("tt4 : " + tt4);
//
//        System.out.println("tt2 == tt4 : " + (tt2 == tt4));

        List<Tree> treeList = new ArrayList<>();
        treeList.add(new Tree(1, 2, "n1", "c1", "t1"));
        treeList.add(new Tree(1, 2, "n2", "c2", "t2"));
        treeList.add(new Tree(1, 2, "n2", "c2", "t2"));
        treeList.add(new Tree(1, 2, "n1", "c1", "t1"));
        treeList.add(new Tree(1, 2, "n3", "c1", "t1"));
        treeList.add(new Tree(1, 2, "n1", "c4", "t1"));
        treeList.add(new Tree(1, 2, "n1", "c1", "t5"));

        for (Tree tree : treeList) {
            tree.plantTree();
        }

    }
}
