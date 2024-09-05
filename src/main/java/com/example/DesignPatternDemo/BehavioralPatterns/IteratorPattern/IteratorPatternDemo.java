package com.example.DesignPatternDemo.BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPatternDemo {
    public void execute() {
        System.out.println("---- IteratorPatternDemo.execute ----");

        /*
            Introduction:
                Iterator pattern lets you traverse elements of a collection sequentially without exposing its underlying
                representation (list, stack, tree, etc.).

            Problem statement:
            1. How do you sequentially traverse elements of a complex data structure, such as a tree? For example,
                one day you might be just fine with depth-first traversal of a tree. Yet the next day you might
                require breadth-first traversal. Adding more and more traversal algorithms to the collection gradually
                blurs its primary responsibility, which is efficient data storage.
            2. The client code that’s supposed to work with various collections may not even care how they store their
                elements. However, since collections all provide different ways of accessing their elements, you have no
                option other than to couple your code to the specific collection classes.

            Solution:
                The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a
                separate object called an iterator. It provides a generic way of iterating over a collection
                independent of its type.

                In addition to implementing the algorithm itself, an iterator object encapsulates all the traversal
                details, such as the current position and how many elements are left till the end. Because of this,
                several iterators can go through the same collection at the same time, independently of each other.

                // Create an iterator
                Iterator iterator = notificationList.createIterator();

                // It wouldn't matter if list is Array or ArrayList or anything else.
                while (iterator.hasNext()) {
                    Notification notification = iterator.next());
                }

            Implementation:
                Iterator in Java :
                    - Iterator is one of the Java cursors. Java Iterator is an interface that is
                    practiced in order to iterate over a collection of Java object components entirety one by one.
                    - It belongs to java.util package.
                    - It can be used to traverse through the elements of the Collection object.
                    - The Java Iterator is also known as the universal cursor of Java as it is appropriate for all the
                    classes of the Collection framework
                    - we can use both of the read and remove operations.
                    - If a user is working with a for loop, they cannot modernize(add/remove) the Collection, whereas,
                    if they use the Java Iterator, they can simply update the Collection.

                java.util.Iterator interface methods
                    - hasNext(): - returns true if there are more elements left in the iteration.
                    - next() - returns next element in the traversal
                    - remove() - remove the last element returned by the iterator

                Iterators and for-each in Java
                    - When we are using for-each, we are actually using iterators internally.
                    - The iterator is just clutter. Furthermore, it is an opportunity for error. The for-each construct
                        gets rid of the clutter and the opportunity for error.

            Applicability:
                1. Use iterator pattern when your collection has a complex data structure under the hood,
                    but you want to hide its complexity from clients (convenience, or security purpose)
                2. Reduce duplication of traversal code across your app.
                3. Want your code to be able to traverse different data structures or when types of these
                    structures are unknown beforehand.
         */

        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Gurgaon");

        // Iterator to iterate the cityNames
        Iterator iterator = cityNames.iterator();
        System.out.print("CityNames : ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Product p1 = new Product("p1", 1);
        Product p2 = new Product("p2", 4);
        Product p3 = new Product("p3", 2);
        Product p4 = new Product("p4", 7);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        System.out.print("Cart Products: ");
        Iterator<Product> productIterator = cart.getIterator();
        while (productIterator.hasNext()) {
            System.out.print("[" + productIterator.next() + "], ");
        }
        System.out.println("");

    }
}
