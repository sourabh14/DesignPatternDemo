package com.example.DesignPrincipleDemo;

public class SOLIDPrinciples {
    public void execute() {
        System.out.println("\n-- Single Responsibility Principle --\n");
        /*
            Single Responsibility Principle
                - A class should have only one reason to change
                - Try to make every class responsible for a single part of the functionality and make that
                    responsibility entirely encapsulated
            When to apply SRP
                - If you feel it is becoming hard to focus on specific aspects of program one at a time,
                    check if class can be divided.
            Eg: Sale order and tax calculator


            Open/Closed Principle
                - Classes should be open for extension but closed for modification
                - This can avoid breaking existing code from breaking
                - A class is open if you can extend it, and add new methods and fields override base behaviour
                - If a class is already developed, tested, reviewed and included in some framework or otherwise
                used in an app then instead of changing the code directly, create a subclass and override parts
                of original class
                - Eg decorator pattern

            Liskov Substitution Principle
                - Subclass should remain compatible with the behaviour of superclass.
                - When extending a class, you should be able to pass objects of the subclass in place
                of objects of the parent class without breaking client code
                - Eg add method of subclass throws IllegalArgumentException in case of invalid input

            Interface Segregation Principle
                - Clients shouldn't be forced to depend on methods they don't use
                - Break down fat interfaces into more granular and specific ones. Clients should implement
                    only those methods which they need. Otherwise, a change in a fat interface would break
                    even clients that don't use changed methods
                - Classes can implement only those interfaces which have methods that make sense for them.
                pg - 63, 64
                - Eg Ostrich is a type of bird, and we defined fly method() for Bird. But Ostrich don't fly.
                    Create Flyable interface and make other Bird classes implement flyable interface.

             Dependency Inversion Principle
                - Classes should depend on interface, rather than concrete classes.
                - High level classes shouldn't depend on low-level classes. Both should depend on abstraction.
                - Low-level classes implement basic operations such as working with a disk, transferring data over a
                    network, connecting to a database, etc.
                - High-level classes contain complex business logic that directs low-level classes to do something.
                - Eg DAO layer

         */
    }
}
