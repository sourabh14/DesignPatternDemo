package com.example.DesignPatternDemo.CreationalPattern.SingletonPattern;

public class SingletonDemo {

    public void execute() {
        System.out.println("--Singleton pattern demo--");

        /* Singleton pattern lets you ensure that a class has only one instance, while providing
            a global access point to this instance.

        Purpose:
            1. Ensure that a class has just a single instance - common reason for this is to control access
                to some shared resource—for example, a database or a file.
            2. Provide a global access point to that instance - access some object from anywhere in the program
            3. Protect that instance from being overwritten by other code - Global variables, while they’re very handy,
                they’re also very unsafe since any code can potentially overwrite the contents of those variables
                and crash the app.

        Implementation:
            1. Make the default constructor private. It is impossible to implement with a regular constructor since a
                constructor call must always return a new object by design.
            2. Create a static creation method that acts as a constructor.
         */

        System.out.println("Classic Implementation - Lazy instantiation");
        Database db = Database.getInstance();

        System.out.println("Thread Safe Implementation");
        ThreadSafeDatabase tsdb = ThreadSafeDatabase.getInstance();

        System.out.println("Eager Instantiation - also thread safe");
        EagerInstantiation ei = EagerInstantiation.getInstance();

        System.out.println("Double Checked Locking (the best)");
        DoubleCheckedLocking dcl = DoubleCheckedLocking.getInstance();

    }

}
